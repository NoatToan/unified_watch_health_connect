package com.google.i18n.phonenumbers.metadata.source;

import com.google.i18n.phonenumbers.Phonemetadata;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
final class MapBackedMetadataContainer<T> implements MetadataContainer {
    private final KeyProvider<T> keyProvider;
    private final ConcurrentMap<T, Phonemetadata.PhoneMetadata> metadataMap = new ConcurrentHashMap();

    public interface KeyProvider<T> {
        T getKeyOf(Phonemetadata.PhoneMetadata phoneMetadata);
    }

    private MapBackedMetadataContainer(KeyProvider<T> keyProvider) {
        this.keyProvider = keyProvider;
    }

    public static MapBackedMetadataContainer<Integer> byCountryCallingCode() {
        return new MapBackedMetadataContainer<>(new KeyProvider<Integer>() { // from class: com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.KeyProvider
            public Integer getKeyOf(Phonemetadata.PhoneMetadata phoneMetadata) {
                return Integer.valueOf(phoneMetadata.getCountryCode());
            }
        });
    }

    public static MapBackedMetadataContainer<String> byRegionCode() {
        return new MapBackedMetadataContainer<>(new KeyProvider<String>() { // from class: com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.1
            @Override // com.google.i18n.phonenumbers.metadata.source.MapBackedMetadataContainer.KeyProvider
            public String getKeyOf(Phonemetadata.PhoneMetadata phoneMetadata) {
                return phoneMetadata.getId();
            }
        });
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.MetadataContainer
    public void accept(Phonemetadata.PhoneMetadata phoneMetadata) {
        this.metadataMap.put(this.keyProvider.getKeyOf(phoneMetadata), phoneMetadata);
    }

    public KeyProvider<T> getKeyProvider() {
        return this.keyProvider;
    }

    public Phonemetadata.PhoneMetadata getMetadataBy(T t7) {
        if (t7 != null) {
            return this.metadataMap.get(t7);
        }
        return null;
    }
}
