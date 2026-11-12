package ie2;

import android.graphics.Bitmap;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes11.dex */
public interface j {
    void a(float f14);

    void b(Object obj);

    void c(float f14);

    com.garmin.android.library.mapsdkadapter.p d();

    void e(String str);

    void f(Bitmap bitmap);

    void g(com.garmin.android.library.mapsdkadapter.f fVar);

    com.garmin.android.library.mapsdkadapter.f getPosition();

    Parcelable getTag();

    /* JADX INFO: renamed from: getTag, reason: collision with other method in class */
    Object mo329getTag();

    String getTitle();

    float getZIndex();

    void h(float f14, float f15);

    void i(String str);

    void j(float f14, float f15);

    void k();

    void l(boolean z14);

    void m();

    void n(boolean z14);

    void remove();

    void setIcon(int i14);

    void setRotation(float f14);

    void setVisible(boolean z14);
}
