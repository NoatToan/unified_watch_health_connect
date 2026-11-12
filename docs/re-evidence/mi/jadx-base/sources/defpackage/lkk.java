package defpackage;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class lkk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f25178b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set<String> g;

    @RequiresApi(20)
    public static class a {
        public static void a(Object obj, Intent intent, Bundle bundle) {
            RemoteInput.addResultsToIntent((RemoteInput[]) obj, intent, bundle);
        }

        public static RemoteInput b(lkk lkkVar) {
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(lkkVar.i()).setLabel(lkkVar.h()).setChoices(lkkVar.e()).setAllowFreeFormInput(lkkVar.c()).addExtras(lkkVar.g());
            Set<String> setD = lkkVar.d();
            if (setD != null) {
                Iterator<String> it = setD.iterator();
                while (it.hasNext()) {
                    b.d(builderAddExtras, it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(builderAddExtras, lkkVar.f());
            }
            return builderAddExtras.build();
        }

        public static Bundle c(Intent intent) {
            return RemoteInput.getResultsFromIntent(intent);
        }
    }

    @RequiresApi(26)
    public static class b {
        public static void a(lkk lkkVar, Intent intent, Map<String, Uri> map) {
            RemoteInput.addDataResultToIntent(lkk.a(lkkVar), intent, map);
        }

        public static Set<String> b(Object obj) {
            return ((RemoteInput) obj).getAllowedDataTypes();
        }

        public static Map<String, Uri> c(Intent intent, String str) {
            return RemoteInput.getDataResultsFromIntent(intent, str);
        }

        public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z) {
            return builder.setAllowDataType(str, z);
        }
    }

    @RequiresApi(29)
    public static class c {
        public static int a(Object obj) {
            return ((RemoteInput) obj).getEditChoicesBeforeSending();
        }

        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i) {
            return builder.setEditChoicesBeforeSending(i);
        }
    }

    @RequiresApi(20)
    public static RemoteInput a(lkk lkkVar) {
        return a.b(lkkVar);
    }

    @RequiresApi(20)
    public static RemoteInput[] b(lkk[] lkkVarArr) {
        if (lkkVarArr == null) {
            return null;
        }
        RemoteInput[] remoteInputArr = new RemoteInput[lkkVarArr.length];
        for (int i = 0; i < lkkVarArr.length; i++) {
            remoteInputArr[i] = a(lkkVarArr[i]);
        }
        return remoteInputArr;
    }

    public boolean c() {
        return this.d;
    }

    public Set<String> d() {
        return this.g;
    }

    public CharSequence[] e() {
        return this.c;
    }

    public int f() {
        return this.e;
    }

    public Bundle g() {
        return this.f;
    }

    public CharSequence h() {
        return this.f25178b;
    }

    public String i() {
        return this.f25177a;
    }

    public boolean j() {
        return (c() || (e() != null && e().length != 0) || d() == null || d().isEmpty()) ? false : true;
    }
}
