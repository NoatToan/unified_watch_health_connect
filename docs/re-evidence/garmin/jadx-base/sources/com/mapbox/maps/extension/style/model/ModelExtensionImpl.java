package com.mapbox.maps.extension.style.model;

import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.extension.style.StyleContract;
import com.mapbox.maps.extension.style.utils.ExpectedUtilsKt;
import p005kotlin.Metadata;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/mapbox/maps/extension/style/model/ModelExtensionImpl;", "Lcom/mapbox/maps/extension/style/StyleContract$StyleModelExtension;", "builder", "Lcom/mapbox/maps/extension/style/model/ModelExtensionImpl$Builder;", "(Lcom/mapbox/maps/extension/style/model/ModelExtensionImpl$Builder;)V", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "Builder", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class ModelExtensionImpl implements StyleContract.StyleModelExtension {
    private final Builder builder;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0003X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/mapbox/maps/extension/style/model/ModelExtensionImpl$Builder;", "", "modelId", "", "(Ljava/lang/String;)V", "getModelId", "()Ljava/lang/String;", "uri", "getUri$extension_style_release", "setUri$extension_style_release", "build", "Lcom/mapbox/maps/extension/style/model/ModelExtensionImpl;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @MapboxExperimental
    public static final class Builder {
        private final String modelId;
        private String uri;

        public Builder(String str) {
            str.getClass();
            this.modelId = str;
            this.uri = "";
        }

        public final ModelExtensionImpl build() {
            if (this.uri.length() != 0) {
                return new ModelExtensionImpl(this);
            }
            h.z("3D Model extension requires model uri input.");
            return null;
        }

        public final String getModelId() {
            return this.modelId;
        }

        /* JADX INFO: renamed from: getUri$extension_style_release, reason: from getter */
        public final String getUri() {
            return this.uri;
        }

        public final void setUri$extension_style_release(String str) {
            str.getClass();
            this.uri = str;
        }

        public final Builder uri(String uri) {
            uri.getClass();
            this.uri = uri;
            return this;
        }
    }

    public ModelExtensionImpl(Builder builder) {
        builder.getClass();
        this.builder = builder;
    }

    @Override // com.mapbox.maps.extension.style.StyleContract.StyleModelExtension
    public void bindTo(MapboxStyleManager delegate) {
        delegate.getClass();
        ExpectedUtilsKt.check(delegate.addStyleModel(this.builder.getModelId(), this.builder.getUri()));
    }
}
