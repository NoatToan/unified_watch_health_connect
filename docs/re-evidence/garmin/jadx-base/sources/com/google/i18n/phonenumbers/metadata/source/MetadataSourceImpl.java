package com.google.i18n.phonenumbers.metadata.source;

import androidx.core.view.j;
import com.google.i18n.phonenumbers.MetadataLoader;
import com.google.i18n.phonenumbers.Phonemetadata;
import com.google.i18n.phonenumbers.internal.GeoEntityUtility;
import com.google.i18n.phonenumbers.metadata.init.MetadataParser;
import tn.k;
import vb.h;

/* JADX INFO: loaded from: classes2.dex */
public final class MetadataSourceImpl implements MetadataSource {
    private final MetadataBootstrappingGuard<CompositeMetadataContainer> bootstrappingGuard;
    private final PhoneMetadataFileNameProvider phoneMetadataFileNameProvider;

    public MetadataSourceImpl(PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, MetadataLoader metadataLoader, MetadataParser metadataParser) {
        this(phoneMetadataFileNameProvider, new BlockingMetadataBootstrappingGuard(metadataLoader, metadataParser, new CompositeMetadataContainer()));
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.NonGeographicalEntityMetadataSource
    public Phonemetadata.PhoneMetadata getMetadataForNonGeographicalRegion(int i14) {
        if (!GeoEntityUtility.isGeoEntity(i14)) {
            return ((CompositeMetadataContainer) this.bootstrappingGuard.getOrBootstrap(this.phoneMetadataFileNameProvider.getFor(Integer.valueOf(i14)))).getMetadataBy(i14);
        }
        h.s(j.f(i14, " calling code belongs to a geo entity"));
        return null;
    }

    @Override // com.google.i18n.phonenumbers.metadata.source.RegionMetadataSource
    public Phonemetadata.PhoneMetadata getMetadataForRegion(String str) {
        if (GeoEntityUtility.isGeoEntity(str)) {
            return ((CompositeMetadataContainer) this.bootstrappingGuard.getOrBootstrap(this.phoneMetadataFileNameProvider.getFor(str))).getMetadataBy(str);
        }
        h.s(k.g(str, " region code is a non-geo entity"));
        return null;
    }

    public MetadataSourceImpl(PhoneMetadataFileNameProvider phoneMetadataFileNameProvider, MetadataBootstrappingGuard<CompositeMetadataContainer> metadataBootstrappingGuard) {
        this.phoneMetadataFileNameProvider = phoneMetadataFileNameProvider;
        this.bootstrappingGuard = metadataBootstrappingGuard;
    }
}
