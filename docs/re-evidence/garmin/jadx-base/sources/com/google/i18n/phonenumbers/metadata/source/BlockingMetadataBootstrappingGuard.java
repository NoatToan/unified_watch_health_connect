package com.google.i18n.phonenumbers.metadata.source;

import com.airbnb.lottie.animation.keyframe.a;
import com.google.i18n.phonenumbers.MetadataLoader;
import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.metadata.init.MetadataParser;
import com.google.i18n.phonenumbers.metadata.source.MetadataContainer;
import fb1.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
final class BlockingMetadataBootstrappingGuard<T extends MetadataContainer> implements MetadataBootstrappingGuard<T> {
    private final Map<String, String> loadedFiles = new ConcurrentHashMap();
    private final T metadataContainer;
    private final MetadataLoader metadataLoader;
    private final MetadataParser metadataParser;

    public BlockingMetadataBootstrappingGuard(MetadataLoader metadataLoader, MetadataParser metadataParser, T t7) {
        this.metadataLoader = metadataLoader;
        this.metadataParser = metadataParser;
        this.metadataContainer = t7;
    }

    private synchronized void bootstrapMetadata(String str) {
        try {
            if (this.loadedFiles.containsKey(str)) {
                return;
            }
            Iterator<Phonemetadata.PhoneMetadata> it = read(str).iterator();
            while (it.hasNext()) {
                this.metadataContainer.accept(it.next());
            }
            this.loadedFiles.put(str, str);
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private Collection<Phonemetadata.PhoneMetadata> read(String str) {
        try {
            return this.metadataParser.parse(this.metadataLoader.loadMetadata(str));
        } catch (IllegalArgumentException | IllegalStateException e4) {
            a.x(c.n("Failed to read file ", str), e4);
            return null;
        }
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.MetadataBootstrappingGuard
    public T getOrBootstrap(String str) {
        if (!this.loadedFiles.containsKey(str)) {
            bootstrapMetadata(str);
        }
        return this.metadataContainer;
    }
}
