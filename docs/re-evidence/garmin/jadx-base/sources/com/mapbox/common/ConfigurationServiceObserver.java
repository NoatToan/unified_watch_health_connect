package com.mapbox.common;

/* JADX INFO: loaded from: classes2.dex */
public interface ConfigurationServiceObserver {
    void didEncounterError(ConfigurationServiceError configurationServiceError);

    void didStartUpdate();

    void didUpdate(ConfigurationOptions configurationOptions);
}
