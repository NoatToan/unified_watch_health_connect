package com.huawei.hms.maps.model.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.huawei.hms.maps.mai;

/* JADX INFO: loaded from: classes34.dex */
public interface ITileOverlayDelegate extends IInterface {
    void clearTileCache();

    boolean equalsRemote(ITileOverlayDelegate iTileOverlayDelegate);

    boolean getFadeIn();

    String getId();

    float getTransparency();

    float getZIndex();

    int hashCodeRemote();

    boolean isVisible();

    void remove();

    void setFadeIn(boolean z);

    void setTransparency(float f);

    void setVisible(boolean z);

    void setZIndex(float f);

    public static abstract class Stub extends Binder implements ITileOverlayDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        static class Proxy implements ITileOverlayDelegate {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private IBinder f14302a;

            @Override // com.huawei.hms.maps.model.internal.ITileOverlayDelegate
            public void setZIndex(float f) {
                mai.a(this.f14302a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 11, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.ITileOverlayDelegate
            public void setVisible(boolean z) {
                mai.a(z, this.f14302a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 10);
            }

            @Override // com.huawei.hms.maps.model.internal.ITileOverlayDelegate
            public void setTransparency(float f) {
                mai.a(this.f14302a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 9, Float.valueOf(f));
            }

            @Override // com.huawei.hms.maps.model.internal.ITileOverlayDelegate
            public void setFadeIn(boolean z) {
                mai.a(z, this.f14302a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 8);
            }

            @Override // com.huawei.hms.maps.model.internal.ITileOverlayDelegate
            public void remove() {
                mai.j(this.f14302a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 7);
            }

            @Override // com.huawei.hms.maps.model.internal.ITileOverlayDelegate
            public boolean isVisible() {
                return mai.a(this.f14302a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 6);
            }

            @Override // com.huawei.hms.maps.model.internal.ITileOverlayDelegate
            public int hashCodeRemote() {
                return mai.c(this.f14302a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 13);
            }

            @Override // com.huawei.hms.maps.model.internal.ITileOverlayDelegate
            public float getZIndex() {
                return mai.b(this.f14302a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 5);
            }

            @Override // com.huawei.hms.maps.model.internal.ITileOverlayDelegate
            public float getTransparency() {
                return mai.b(this.f14302a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 4);
            }

            public String getInterfaceDescriptor() {
                return "com.huawei.hms.maps.model.internal.ITileOverlayDelegate";
            }

            @Override // com.huawei.hms.maps.model.internal.ITileOverlayDelegate
            public String getId() {
                return mai.h(this.f14302a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 3);
            }

            @Override // com.huawei.hms.maps.model.internal.ITileOverlayDelegate
            public boolean getFadeIn() {
                return mai.a(this.f14302a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 2);
            }

            @Override // com.huawei.hms.maps.model.internal.ITileOverlayDelegate
            public boolean equalsRemote(ITileOverlayDelegate iTileOverlayDelegate) {
                return mai.a(iTileOverlayDelegate, this.f14302a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 12);
            }

            @Override // com.huawei.hms.maps.model.internal.ITileOverlayDelegate
            public void clearTileCache() {
                mai.j(this.f14302a, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate", 1);
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14302a;
            }

            Proxy(IBinder iBinder) {
                this.f14302a = iBinder;
            }
        }

        public static ITileOverlayDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.huawei.hms.maps.model.internal.ITileOverlayDelegate");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITileOverlayDelegate)) ? new Proxy(iBinder) : (ITileOverlayDelegate) iInterfaceQueryLocalInterface;
        }

        public Stub() {
            attachInterface(this, "com.huawei.hms.maps.model.internal.ITileOverlayDelegate");
        }
    }
}
