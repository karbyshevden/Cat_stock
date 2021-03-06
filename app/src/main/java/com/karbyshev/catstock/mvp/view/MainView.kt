package com.karbyshev.catstock.mvp.view

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.karbyshev.catstock.mvp.model.NetworkItem

@StateStrategyType(value = AddToEndSingleStrategy::class)
interface MainView : MvpView{

    fun onNotesLoaded(notes: List<NetworkItem>)

    fun updateView()

    fun onSearchResult(notes: List<NetworkItem>)

    fun onAllNotesDeleted()

    fun onNoteDeleted()

    fun showNoteInfoDialog(noteInfo: String)

    fun hideNoteInfoDialog()

    fun showNoteDeleteDialog(notePosition: Int)

    fun hideNoteDeleteDialog()

    fun showNoteContextDialog(notePosition: Int)

    fun hideNoteContextDialog()

    fun openNoteScreen(noteId: Long)
}