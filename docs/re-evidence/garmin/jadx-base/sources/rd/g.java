package rd;

import am.j;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import com.garmin.android.gncs.NotificationConstants;
import i63.i;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import k63.m;
import o13.p;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.k0;
import sd.q;
import vb.h;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrd/g;", "Ll63/b;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "Lrd/d;", "configuration", "<init>", "(Landroid/os/Bundle;Lrd/d;)V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g extends l63.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f152002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f152003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f152004c;

    public g(Bundle bundle, d dVar) {
        bundle.getClass();
        dVar.getClass();
        this.f152002a = bundle;
        this.f152003b = dVar;
        this.f152004c = "";
    }

    public static void G(d dVar, k63.e eVar, Bundle bundle) {
        if (dVar.f151995b != 1) {
            return;
        }
        bundle.getClass();
        if (bundle.containsKey(NotificationConstants.KEY_DATA_MIME_TYPE)) {
            return;
        }
        if (s.g(eVar.getF103234b(), m.a.f103253a) || s.g(eVar.getF103234b(), m.d.f103256a)) {
            String f103233a = eVar.getF103221c();
            f103233a.getClass();
            bundle.putString(NotificationConstants.KEY_DATA_MIME_TYPE, f103233a);
        }
    }

    @Override // l63.b, l63.f
    public final void A(double d14) {
        Bundle bundle = this.f152002a;
        bundle.getClass();
        String str = this.f152004c;
        str.getClass();
        bundle.putDouble(str, d14);
    }

    @Override // l63.d
    public final boolean C(k63.e eVar) {
        eVar.getClass();
        return this.f152003b.f151996c;
    }

    @Override // l63.b, l63.f
    public final void D() {
        Bundle bundle = this.f152002a;
        bundle.getClass();
        String str = this.f152004c;
        str.getClass();
        bundle.putString(str, null);
    }

    @Override // l63.b
    public final void E(k63.e eVar, int i14) {
        eVar.getClass();
        this.f152004c = eVar.d(i14);
        if (this.f152003b.f151995b == 1) {
            Bundle bundle = this.f152002a;
            bundle.getClass();
            boolean zContainsKey = bundle.containsKey(NotificationConstants.KEY_DATA_MIME_TYPE);
            boolean zG = s.g(this.f152004c, NotificationConstants.KEY_DATA_MIME_TYPE);
            if (zContainsKey && zG) {
                h.s(j.o(this.f152004c, "' that conflicts with the class discriminator. You can rename a property with @SerialName annotation.", hb.a.l("SavedStateEncoder for ", nd.b.h(bundle, NotificationConstants.KEY_DATA_MIME_TYPE), " has property '")));
            }
        }
    }

    @Override // l63.f
    /* JADX INFO: renamed from: a */
    public final p63.e getF129837e() {
        return this.f152003b.f151994a;
    }

    @Override // l63.b, l63.f
    public final l63.d c(k63.e eVar) {
        eVar.getClass();
        boolean zG = s.g(this.f152004c, "");
        Bundle bundle = this.f152002a;
        d dVar = this.f152003b;
        if (zG) {
            G(dVar, eVar, bundle);
            return this;
        }
        k0.f134949a.getClass();
        Bundle bundleA = h7.c.a((p[]) Arrays.copyOf(new p[0], 0));
        bundle.getClass();
        nd.f.b(this.f152004c, bundle, bundleA);
        G(dVar, eVar, bundleA);
        return new g(bundleA, dVar);
    }

    @Override // l63.b, l63.f
    public final void h(short s8) {
        Bundle bundle = this.f152002a;
        bundle.getClass();
        String str = this.f152004c;
        str.getClass();
        bundle.putInt(str, s8);
    }

    @Override // l63.b, l63.f
    public final void i(boolean z14) {
        Bundle bundle = this.f152002a;
        bundle.getClass();
        String str = this.f152004c;
        str.getClass();
        bundle.putBoolean(str, z14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l63.f
    public final <T> void l(i<? super T> iVar, T t7) {
        iVar.getClass();
        k63.e descriptor = iVar.getF158591b();
        if (s.g(descriptor, c.f151978a)) {
            sd.c cVar = sd.c.f158569a;
            t7.getClass();
            cVar.getClass();
            sd.c.b(this, (CharSequence) t7);
            return;
        }
        if (s.g(descriptor, c.f151979b)) {
            sd.e eVar = sd.e.f158572b;
            t7.getClass();
            eVar.serialize(this, (Parcelable) t7);
            return;
        }
        if (s.g(descriptor, c.f151980c)) {
            sd.d dVar = sd.d.f158571b;
            t7.getClass();
            dVar.serialize(this, (Serializable) t7);
            return;
        }
        if (s.g(descriptor, c.f151981d)) {
            sd.f fVar = sd.f.f158573a;
            t7.getClass();
            fVar.getClass();
            sd.f.b(this, (IBinder) t7);
            return;
        }
        if (s.g(descriptor, c.f151986i) || s.g(descriptor, c.f151987j)) {
            sd.a aVar = sd.a.f158565a;
            t7.getClass();
            aVar.getClass();
            sd.a.b(this, (CharSequence[]) t7);
            return;
        }
        if (s.g(descriptor, c.f151988k) || s.g(descriptor, c.f151989l)) {
            sd.b bVar = sd.b.f158567a;
            t7.getClass();
            bVar.serialize(this, (List) t7);
            return;
        }
        if (s.g(descriptor, c.f151982e) || s.g(descriptor, c.f151983f)) {
            sd.i iVar2 = sd.i.f158578a;
            t7.getClass();
            iVar2.getClass();
            sd.i.b(this, (Parcelable[]) t7);
            return;
        }
        if (s.g(descriptor, c.f151984g) || s.g(descriptor, c.f151985h)) {
            sd.j jVar = sd.j.f158580a;
            t7.getClass();
            jVar.serialize(this, (List) t7);
            return;
        }
        if (s.g(descriptor, c.f151990m) || s.g(descriptor, c.f151991n) || s.g(descriptor, c.f151992o)) {
            q qVar = q.f158597a;
            t7.getClass();
            qVar.serialize(this, (SparseArray) t7);
            return;
        }
        k63.e descriptor2 = iVar.getF158591b();
        boolean zG = s.g(descriptor2, b.f151969a);
        Bundle bundle = this.f152002a;
        if (zG) {
            bundle.getClass();
            String str = this.f152004c;
            t7.getClass();
            str.getClass();
            bundle.putIntegerArrayList(str, gl1.d.Z((List) t7));
            return;
        }
        if (s.g(descriptor2, b.f151970b)) {
            bundle.getClass();
            String str2 = this.f152004c;
            t7.getClass();
            nd.f.c(str2, bundle, (List) t7);
            return;
        }
        if (s.g(descriptor2, b.f151971c)) {
            bundle.getClass();
            String str3 = this.f152004c;
            t7.getClass();
            str3.getClass();
            bundle.putBooleanArray(str3, (boolean[]) t7);
            return;
        }
        if (s.g(descriptor2, b.f151972d)) {
            bundle.getClass();
            String str4 = this.f152004c;
            t7.getClass();
            str4.getClass();
            bundle.putCharArray(str4, (char[]) t7);
            return;
        }
        if (s.g(descriptor2, b.f151973e)) {
            bundle.getClass();
            String str5 = this.f152004c;
            t7.getClass();
            str5.getClass();
            bundle.putDoubleArray(str5, (double[]) t7);
            return;
        }
        if (s.g(descriptor2, b.f151974f)) {
            bundle.getClass();
            String str6 = this.f152004c;
            t7.getClass();
            str6.getClass();
            bundle.putFloatArray(str6, (float[]) t7);
            return;
        }
        if (s.g(descriptor2, b.f151975g)) {
            bundle.getClass();
            String str7 = this.f152004c;
            t7.getClass();
            str7.getClass();
            bundle.putIntArray(str7, (int[]) t7);
            return;
        }
        if (s.g(descriptor2, b.f151976h)) {
            bundle.getClass();
            String str8 = this.f152004c;
            t7.getClass();
            str8.getClass();
            bundle.putLongArray(str8, (long[]) t7);
            return;
        }
        if (!s.g(descriptor2, b.f151977i)) {
            iVar.serialize(this, t7);
            return;
        }
        bundle.getClass();
        String str9 = this.f152004c;
        t7.getClass();
        str9.getClass();
        bundle.putStringArray(str9, (String[]) t7);
    }

    @Override // l63.b, l63.f
    public final void m(k63.e eVar, int i14) {
        eVar.getClass();
        Bundle bundle = this.f152002a;
        bundle.getClass();
        String str = this.f152004c;
        str.getClass();
        bundle.putInt(str, i14);
    }

    @Override // l63.b, l63.f
    public final void o(int i14) {
        Bundle bundle = this.f152002a;
        bundle.getClass();
        String str = this.f152004c;
        str.getClass();
        bundle.putInt(str, i14);
    }

    @Override // l63.b, l63.f
    public final void p(String str) {
        str.getClass();
        Bundle bundle = this.f152002a;
        bundle.getClass();
        String str2 = this.f152004c;
        str2.getClass();
        bundle.putString(str2, str);
    }

    @Override // l63.b, l63.f
    public final void s(long j8) {
        Bundle bundle = this.f152002a;
        bundle.getClass();
        String str = this.f152004c;
        str.getClass();
        bundle.putLong(str, j8);
    }

    @Override // l63.b, l63.f
    public final void t(char c14) {
        Bundle bundle = this.f152002a;
        bundle.getClass();
        String str = this.f152004c;
        str.getClass();
        bundle.putChar(str, c14);
    }

    @Override // l63.b, l63.f
    public final void w(byte b14) {
        Bundle bundle = this.f152002a;
        bundle.getClass();
        String str = this.f152004c;
        str.getClass();
        bundle.putInt(str, b14);
    }

    @Override // l63.b, l63.f
    public final void y(float f14) {
        Bundle bundle = this.f152002a;
        bundle.getClass();
        String str = this.f152004c;
        str.getClass();
        bundle.putFloat(str, f14);
    }
}
