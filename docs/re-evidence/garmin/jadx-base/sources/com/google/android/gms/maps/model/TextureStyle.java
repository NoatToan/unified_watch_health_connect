package com.google.android.gms.maps.model;

/* JADX INFO: loaded from: classes14.dex */
public class TextureStyle extends StampStyle {
    public /* synthetic */ TextureStyle(BitmapDescriptor bitmapDescriptor, zzaf zzafVar) {
        super(bitmapDescriptor);
    }

    public static Builder newBuilder(BitmapDescriptor bitmapDescriptor) {
        return new Builder(null).stamp(bitmapDescriptor);
    }

    public static final class Builder extends StampStyle.Builder<Builder> {
        public /* synthetic */ Builder(zzaf zzafVar) {
        }

        public TextureStyle build() {
            return new TextureStyle(this.zza, null);
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        public final /* bridge */ /* synthetic */ StampStyle.Builder self() {
            return this;
        }

        @Override // com.google.android.gms.maps.model.StampStyle.Builder
        public Builder self() {
            return this;
        }

        private Builder() {
            throw null;
        }
    }
}
