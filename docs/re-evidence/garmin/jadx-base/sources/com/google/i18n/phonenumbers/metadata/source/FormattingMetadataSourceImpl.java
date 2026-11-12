package com.google.i18n.phonenumbers.metadata.source;

import com.google.i18n.phonenumbers.MetadataLoader;
import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.metadata.init.MetadataParser;

/* JADX INFO: loaded from: classes2.dex */
public final class FormattingMetadataSourceImpl implements FormattingMetadataSource {
    private final MetadataBootstrappingGuard<MapBackedMetadataContainer<Integer>> bootstrappingGuard;
    private final PhoneMetadataFileNameProvider phoneMetadataFileNameProvider;

    public FormattingMetadataSourceImpl(PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, MetadataLoader metadataLoader, MetadataParser metadataParser) {
        this(phoneMetadataFileNameProvider, new BlockingMetadataBootstrappingGuard(metadataLoader, metadataParser, MapBackedMetadataContainer.byCountryCallingCode()));
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.FormattingMetadataSource
    public Phonemetadata.PhoneMetadata getFormattingMetadataForCountryCallingCode(int i14) {
        return ((MapBackedMetadataContainer) this.bootstrappingGuard.getOrBootstrap(this.phoneMetadataFileNameProvider.getFor(Integer.valueOf(i14)))).getMetadataBy(Integer.valueOf(i14));
    }

    public FormattingMetadataSourceImpl(PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, MetadataBootstrappingGuard<MapBackedMetadataContainer<Integer>> metadataBootstrappingGuard) {
        this.phoneMetadataFileNameProvider = phoneMetadataFileNameProvider;
        this.bootstrappingGuard = metadataBootstrappingGuard;
    }
}
