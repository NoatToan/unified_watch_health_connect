package com.tbruyelle.rxpermissions2;

import android.annotation.TargetApi;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes18.dex */
public class RxPermissionsFragment extends Fragment {
    private static final int c = 42;
    private Map<String, PublishSubject<Permission>> a = new HashMap();
    private boolean b;

    @TargetApi(23)
    public boolean a(String str) {
        return getActivity().checkSelfPermission(str) == 0;
    }

    @TargetApi(23)
    public boolean b(String str) {
        return getActivity().getPackageManager().isPermissionRevokedByPolicy(str, getActivity().getPackageName());
    }

    public void c(String str) {
        if (this.b) {
            Log.d(RxPermissions.b, str);
        }
    }

    public boolean containsByPermission(@NonNull String str) {
        return this.a.containsKey(str);
    }

    public void d(String[] strArr, int[] iArr, boolean[] zArr) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            c("onRequestPermissionsResult  " + strArr[i]);
            PublishSubject<Permission> publishSubject = this.a.get(strArr[i]);
            if (publishSubject == null) {
                Log.e(RxPermissions.b, "RxPermissions.onRequestPermissionsResult invoked but didn't find the corresponding permission request.");
                return;
            }
            this.a.remove(strArr[i]);
            publishSubject.onNext(new Permission(strArr[i], iArr[i] == 0, zArr[i]));
            publishSubject.onComplete();
        }
    }

    @TargetApi(23)
    public void e(@NonNull String[] strArr) {
        requestPermissions(strArr, 42);
    }

    public PublishSubject<Permission> getSubjectByPermission(@NonNull String str) {
        return this.a.get(str);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // android.app.Fragment
    @TargetApi(23)
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i != 42) {
            return;
        }
        boolean[] zArr = new boolean[strArr.length];
        for (int i2 = 0; i2 < strArr.length; i2++) {
            zArr[i2] = shouldShowRequestPermissionRationale(strArr[i2]);
        }
        d(strArr, iArr, zArr);
    }

    public void setLogging(boolean z) {
        this.b = z;
    }

    public PublishSubject<Permission> setSubjectForPermission(@NonNull String str, @NonNull PublishSubject<Permission> publishSubject) {
        return this.a.put(str, publishSubject);
    }
}
