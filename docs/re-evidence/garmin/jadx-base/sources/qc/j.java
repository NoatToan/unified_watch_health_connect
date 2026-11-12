package qc;

import android.net.Uri;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import lc.d0;
import lc.h0;
import lc.r0;
import o13.t;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lqc/j;", "", "Llc/h0;", FirebaseAnalytics.Param.DESTINATION, "<init>", "(Llc/h0;)V", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f144342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f144343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f144344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f144345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f144346e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f144347f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t f144348g;

    public j(h0 h0Var) {
        h0Var.getClass();
        this.f144342a = h0Var;
        this.f144344c = new ArrayList();
        this.f144345d = new LinkedHashMap();
    }

    public final h0.b a(String str) {
        d0 d0Var;
        int size;
        str.getClass();
        t tVar = this.f144348g;
        if (tVar == null || (d0Var = (d0) tVar.getValue()) == null) {
            return null;
        }
        h0.f111771f.getClass();
        String strConcat = "android-app://androidx.navigation/".concat(str);
        r0 r0Var = r0.f111862a;
        r0Var.getClass();
        Uri uri = Uri.parse(strConcat);
        uri.getClass();
        Bundle bundleC = d0Var.c(uri, this.f144345d);
        if (bundleC == null) {
            return null;
        }
        String str2 = d0Var.f111732a;
        if (str2 == null) {
            size = 0;
        } else {
            List<String> pathSegments = uri.getPathSegments();
            r0Var.getClass();
            Uri uri2 = Uri.parse(str2);
            uri2.getClass();
            size = p13.h0.h0(pathSegments, uri2.getPathSegments()).size();
        }
        return new h0.b(this.f144342a, bundleC, d0Var.f111747p, size, false, -1);
    }
}
