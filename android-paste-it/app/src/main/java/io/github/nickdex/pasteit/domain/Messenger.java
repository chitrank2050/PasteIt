package io.github.nickdex.pasteit.domain;

public interface Messenger {
    /**
     * Show a message about network connection problem
     */
    void showNoNetworkMessage();

    /**
     * Show a message that data was loaded from cache
     */
    void showFromCacheMessage();
}
