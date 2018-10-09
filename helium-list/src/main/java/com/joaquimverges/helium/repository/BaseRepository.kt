package com.joaquimverges.helium.repository

import io.reactivex.Single

/**
 * Interface to implement for any data provider used by a Presenter.
 * Here is where the actual data fecthing/caching logic lives.
 */
interface BaseRepository<T> {
    fun getData() : Single<T>
}