package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class fd3 implements ah3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ai3 f17668a;
    public final ih3 c;
    public final List<String> d;
    public final hz6 e;
    public final Map<String, ud3> f = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f17669b = new d(1);

    public fd3(Context context, ai3 ai3Var, xh3 xh3Var) throws InitializationException {
        this.f17668a = ai3Var;
        this.c = ih3.b(context, ai3Var.c());
        this.e = hz6.b(context);
        this.d = d(wh3.b(this, xh3Var));
    }

    @Override // defpackage.ah3
    public CameraInternal a(String str) throws CameraUnavailableException {
        if (this.d.contains(str)) {
            return new qd3(this.c, str, e(str), this.f17669b, this.f17668a.b(), this.f17668a.c(), this.e);
        }
        throw new IllegalArgumentException("The given camera id is not on the available camera id list.");
    }

    @Override // defpackage.ah3
    public Set<String> b() {
        return new LinkedHashSet(this.d);
    }

    public final List<String> d(List<String> list) throws InitializationException {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str.equals("0") || str.equals("1")) {
                arrayList.add(str);
            } else if (g(str)) {
                arrayList.add(str);
            } else {
                zpe.a("Camera2CameraFactory", "Camera " + str + " is filtered out because its capabilities do not contain REQUEST_AVAILABLE_CAPABILITIES_BACKWARD_COMPATIBLE.");
            }
        }
        return arrayList;
    }

    public ud3 e(String str) throws CameraUnavailableException {
        try {
            ud3 ud3Var = this.f.get(str);
            if (ud3Var != null) {
                return ud3Var;
            }
            ud3 ud3Var2 = new ud3(str, this.c);
            this.f.put(str, ud3Var2);
            return ud3Var2;
        } catch (CameraAccessExceptionCompat e) {
            throw bi3.a(e);
        }
    }

    @Override // defpackage.ah3
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public ih3 c() {
        return this.c;
    }

    public final boolean g(String str) throws InitializationException {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) this.c.c(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (CameraAccessExceptionCompat e) {
            throw new InitializationException(bi3.a(e));
        }
    }
}
