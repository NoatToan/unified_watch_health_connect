package com.garmin.android.apps.connectmobile.strava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import c22.s3;
import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.segments.model.StravaStatusDTO;
import fw.p;
import gg1.v0;
import hk1.a0;
import hk1.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.x;
import z10.c3;
import z10.f3;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/strava/StravaConfigActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StravaConfigActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f44941r = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final List<String> f44942t = x.k("COURSE_IMPORT", "ACTIVITY_EXPORT", "WORKOUT_IMPORT");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final List<hk1.d> f44943v = x.k(hk1.d.f84136h, hk1.d.f84134f, hk1.d.f84133e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.strava.a f44944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.strava.d f44945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.strava.g f44946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f44947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<String> f44948e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Boolean f44949f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f44950g = new e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a4.b f44951h = new a4.b(this, 21);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f44952i = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f44953j = new d();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final f f44954k = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final n f44955l = new n();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public fr1.h f44956m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d20.f f44957n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final w1 f44958o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w1 f44959p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final CopyOnWriteArrayList f44960q;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44961a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f44961a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/strava/StravaConfigActivity$c", "Lcom/garmin/android/apps/connectmobile/strava/a$a;", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c implements com.garmin.android.apps.connectmobile.strava.a.InterfaceC0858a {
        public c() {
        }

        @Override // com.garmin.android.apps.connectmobile.strava.a.InterfaceC0858a
        public final void a() {
            StravaConfigActivity stravaConfigActivity = StravaConfigActivity.this;
            if (stravaConfigActivity.isFinishing()) {
                return;
            }
            stravaConfigActivity.ga(null, null);
        }

        @Override // com.garmin.android.apps.connectmobile.strava.a.InterfaceC0858a
        public final void b(hk1.g gVar) {
            ArrayList<String> arrayList;
            gVar.getClass();
            StravaConfigActivity stravaConfigActivity = StravaConfigActivity.this;
            if (stravaConfigActivity.isFinishing()) {
                return;
            }
            stravaConfigActivity.f44948e = new ArrayList<>();
            StravaConfigActivity.f44941r.getClass();
            for (hk1.d dVar : StravaConfigActivity.f44943v) {
                if (gVar.f(dVar.f84140a) && (arrayList = stravaConfigActivity.f44948e) != null) {
                    arrayList.add(dVar.f84140a);
                }
            }
            ArrayList<String> arrayList2 = stravaConfigActivity.f44948e;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                stravaConfigActivity.ga(null, null);
                return;
            }
            com.garmin.android.apps.connectmobile.strava.d dVar2 = new com.garmin.android.apps.connectmobile.strava.d(stravaConfigActivity.f44953j);
            stravaConfigActivity.f44945b = dVar2;
            dVar2.b();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/strava/StravaConfigActivity$d", "Lcom/garmin/android/apps/connectmobile/strava/d$a;", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d implements com.garmin.android.apps.connectmobile.strava.d.a {
        public d() {
        }

        @Override // com.garmin.android.apps.connectmobile.strava.d.a
        public final void a() {
            StravaConfigActivity stravaConfigActivity = StravaConfigActivity.this;
            if (stravaConfigActivity.isFinishing()) {
                return;
            }
            stravaConfigActivity.ga(stravaConfigActivity.f44948e, null);
        }

        @Override // com.garmin.android.apps.connectmobile.strava.d.a
        public final void b(List<hk1.h> list) {
            list.getClass();
            StravaConfigActivity stravaConfigActivity = StravaConfigActivity.this;
            if (stravaConfigActivity.isFinishing()) {
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            for (hk1.h hVar : list) {
                if (s.g(hVar.getConsumerKey(), stravaConfigActivity.f44947d)) {
                    StravaConfigActivity.f44941r.getClass();
                    for (String str : StravaConfigActivity.f44942t) {
                        if (hVar.f(str)) {
                            arrayList.add(str);
                        }
                    }
                    break;
                }
            }
            stravaConfigActivity.ga(stravaConfigActivity.f44948e, arrayList);
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/strava/StravaConfigActivity$e", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public e() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            StravaConfigActivity stravaConfigActivity = StravaConfigActivity.this;
            stravaConfigActivity.f44960q.remove(Long.valueOf(j8));
            if (stravaConfigActivity.isFinishing()) {
                return;
            }
            if (cVar == com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS) {
                com.garmin.android.apps.connectmobile.strava.g gVar = new com.garmin.android.apps.connectmobile.strava.g(stravaConfigActivity.f44954k);
                stravaConfigActivity.f44946c = gVar;
                gVar.b();
            } else if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA) {
                stravaConfigActivity.hideProgressOverlay();
                g1.b(stravaConfigActivity, cVar);
            }
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
            fr1.h hVar = (fr1.h) obj;
            StravaConfigActivity stravaConfigActivity = StravaConfigActivity.this;
            stravaConfigActivity.f44956m = hVar;
            if (stravaConfigActivity.f44949f == null) {
                stravaConfigActivity.f44949f = Boolean.valueOf(hVar.g());
            }
            fr1.h hVar2 = stravaConfigActivity.f44956m;
            String str = "Strava account connected: " + (hVar2 != null ? Boolean.valueOf(hVar2.g()) : null);
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.b(a2Var, "StravaConfigActivity", str);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/strava/StravaConfigActivity$f", "Lcom/garmin/android/apps/connectmobile/strava/g$a;", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f implements com.garmin.android.apps.connectmobile.strava.g.a {
        public f() {
        }

        @Override // com.garmin.android.apps.connectmobile.strava.g.a
        public final void a() {
            a aVar = StravaConfigActivity.f44941r;
            StravaConfigActivity stravaConfigActivity = StravaConfigActivity.this;
            f3 f3VarEa = stravaConfigActivity.ea();
            q92.x xVar = q92.x.DI_CONNECT_THIRDPARTY;
            xVar.getClass();
            androidx.lifecycle.m.a(v1.a(f3VarEa).f183565a, new c3(xVar, "STRAVA", null), 2).f(stravaConfigActivity, stravaConfigActivity.f44951h);
        }

        @Override // com.garmin.android.apps.connectmobile.strava.g.a
        public final void b(List<a0> list) {
            Object next;
            list.getClass();
            String str = v.f84200f.f84204a;
            str.getClass();
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                a0 a0Var = (a0) next;
                if (a0Var.o().length() > 0 && s.g(a0Var.o(), str)) {
                    break;
                }
            }
            a0 a0Var2 = (a0) next;
            String strR = a0Var2 != null ? a0Var2.r() : null;
            StravaConfigActivity stravaConfigActivity = StravaConfigActivity.this;
            stravaConfigActivity.f44947d = strR;
            f3 f3VarEa = stravaConfigActivity.ea();
            q92.x xVar = q92.x.DI_CONNECT_THIRDPARTY;
            xVar.getClass();
            androidx.lifecycle.m.a(v1.a(f3VarEa).f183565a, new c3(xVar, "STRAVA", null), 2).f(stravaConfigActivity, stravaConfigActivity.f44951h);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f44966a;

        public g(e23.l lVar) {
            lVar.getClass();
            this.f44966a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f44966a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44966a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f44967a;

        public h(b.g gVar) {
            this.f44967a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f44967a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class i implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f44968a;

        public i(b.g gVar) {
            this.f44968a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44968a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class j implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f44970b;

        public j(e23.a aVar, b.g gVar) {
            this.f44969a = aVar;
            this.f44970b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44969a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44970b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class k implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f44971a;

        public k(b.g gVar) {
            this.f44971a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f44971a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class l implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f44972a;

        public l(b.g gVar) {
            this.f44972a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44972a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class m implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f44974b;

        public m(e23.a aVar, b.g gVar) {
            this.f44973a = aVar;
            this.f44974b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44973a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44974b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/strava/StravaConfigActivity$n", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class n implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public n() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            StravaConfigActivity stravaConfigActivity = StravaConfigActivity.this;
            if (stravaConfigActivity.isFinishing()) {
                return;
            }
            stravaConfigActivity.hideProgressOverlay();
            if (cVar != com.garmin.android.library.backgroundtaskmanagement.b.c.NO_DATA) {
                g1.b(stravaConfigActivity, cVar);
            }
            stravaConfigActivity.da();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
        }
    }

    public StravaConfigActivity() {
        h hVar = new h(this);
        t0 t0Var = s0.f105811a;
        this.f44958o = new w1(t0Var.b(f3.class), new i(this), hVar, new j(null, this));
        this.f44959p = new w1(t0Var.b(fr1.m.class), new l(this), new k(this), new m(null, this));
        this.f44960q = new CopyOnWriteArrayList();
    }

    public static Uri fa(Uri uri) {
        String scheme;
        String authority;
        String queryParameter;
        String strConcat;
        String queryParameter2;
        String queryParameter3;
        String queryParameter4;
        Uri.Builder builder = new Uri.Builder();
        if (uri == null || (scheme = uri.getScheme()) == null) {
            scheme = "https";
        }
        Uri.Builder builderScheme = builder.scheme(scheme);
        if (uri == null || (authority = uri.getAuthority()) == null) {
            authority = "www.strava.com";
        }
        Uri.Builder builderAppendPath = builderScheme.authority(authority).appendPath("oauth").appendPath("mobile").appendPath("authorize");
        if (uri == null || (queryParameter = uri.getQueryParameter("client_id")) == null) {
            queryParameter = "5987";
        }
        Uri.Builder builderAppendQueryParameter = builderAppendPath.appendQueryParameter("client_id", queryParameter);
        if (uri == null || (strConcat = uri.getQueryParameter("redirect_uri")) == null) {
            v0.T.getClass();
            strConcat = v0.a.b().b().concat("/strava-auth");
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("redirect_uri", strConcat);
        if (uri == null || (queryParameter2 = uri.getQueryParameter("response_type")) == null) {
            queryParameter2 = "code";
        }
        Uri.Builder builderAppendQueryParameter3 = builderAppendQueryParameter2.appendQueryParameter("response_type", queryParameter2);
        if (uri == null || (queryParameter3 = uri.getQueryParameter("approval_prompt")) == null) {
            queryParameter3 = "force";
        }
        Uri.Builder builderAppendQueryParameter4 = builderAppendQueryParameter3.appendQueryParameter("approval_prompt", queryParameter3);
        if (uri == null || (queryParameter4 = uri.getQueryParameter(Action.SCOPE_ATTRIBUTE)) == null) {
            queryParameter4 = "read,read_all,activity:write,profile:write";
        }
        return builderAppendQueryParameter4.appendQueryParameter(Action.SCOPE_ATTRIBUTE, queryParameter4).build();
    }

    public final void ca() {
        if (!hasInternetConnection()) {
            da();
            return;
        }
        fr1.h hVar = this.f44956m;
        if (hVar == null || !hVar.g()) {
            da();
            return;
        }
        StravaStatusDTO.c cVar = ((fr1.i) KoinJavaComponent.get$default(fr1.i.class, null, null, 6, null)).d() == zf1.a.STRAVA ? StravaStatusDTO.c.OPT_IN : StravaStatusDTO.c.OPT_OUT;
        fr1.h hVar2 = this.f44956m;
        StravaStatusDTO stravaStatusDTO = hVar2 != null ? hVar2.f73307b : null;
        if (stravaStatusDTO == null || stravaStatusDTO.f41333e == cVar) {
            da();
            return;
        }
        stravaStatusDTO.f41333e = cVar;
        showProgressOverlay();
        cw.v.f55954b.getClass();
        cw.v vVarA = cw.v.a.a();
        if (vVarA != null) {
            this.f44960q.add(Long.valueOf(vVarA.N(stravaStatusDTO, this.f44955l)));
        }
    }

    public final void da() {
        fr1.h hVar = this.f44956m;
        if (hVar != null) {
            if (!s.g(this.f44949f, hVar != null ? Boolean.valueOf(hVar.g()) : null)) {
                setResult(-1);
            }
        }
        finish();
    }

    public final f3 ea() {
        return (f3) this.f44958o.getValue();
    }

    public final void ga(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        Parcelable parcelable;
        hideProgressOverlay();
        fr1.h hVar = this.f44956m;
        if (hVar == null || (parcelable = this.f44957n) == null) {
            return;
        }
        com.garmin.android.apps.connectmobile.strava.m.a aVar = com.garmin.android.apps.connectmobile.strava.m.f45000y;
        hVar.getClass();
        String str = this.f44947d;
        aVar.getClass();
        Fragment mVar = new com.garmin.android.apps.connectmobile.strava.m();
        Bundle bundle = new Bundle();
        bundle.putParcelable("CONSENT_DATA", parcelable);
        bundle.putBoolean("ACCOUNT_CONNECTED", hVar.b() && hVar.f());
        bundle.putParcelable("CONNECTED_STATUS", hVar);
        bundle.putStringArrayList("CAPABILITY_LIST", arrayList);
        bundle.putStringArrayList("PERMISSION_LIST", arrayList2);
        bundle.putString("STRAVA_CONSUMER_KEY", str);
        mVar.setArguments(bundle);
        ha(mVar, "frag.tag");
        fr1.h hVar2 = this.f44956m;
        String str2 = "showStatusFragment: IsUserAccountConnectedToStrava " + (hVar2 != null ? Boolean.valueOf(hVar2.g()) : null);
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "StravaConfigActivity", str2);
    }

    public final void ha(Fragment fragment, String str) {
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        n23.j.c(supportFragmentManager, supportFragmentManager, R.id.content_frame, fragment, str).s(true, true);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ca();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_content_frame);
        initActionBar(true, R.string.strava_promo_title);
        Object obj = KoinJavaComponent.get$default(f12.b.class, null, null, 6, null);
        obj.getClass();
        if (((f12.b) obj).f()) {
            finish();
        } else if (!s3.b()) {
            ea().f200996b.f(this, new g(new fr1.g(this, 0)));
        } else {
            o.f45012a.getClass();
            ha(new o(), null);
        }
    }

    @Override // b.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setResult(-1);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 16908332) {
            return true;
        }
        ca();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (s3.b()) {
            return;
        }
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        Fragment fragmentG = supportFragmentManager.G("frag.tag");
        if (fragmentG != null) {
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.k(fragmentG);
            aVar.s(true, true);
        }
        if (!hasInternetConnection()) {
            com.garmin.android.apps.connectmobile.strava.n.f45011a.getClass();
            ha(new com.garmin.android.apps.connectmobile.strava.n(), null);
            return;
        }
        showProgressOverlay();
        cw.v.f55954b.getClass();
        cw.v vVarA = cw.v.a.a();
        if (vVarA != null) {
            this.f44960q.add(Long.valueOf(vVarA.M(true, this.f44950g)));
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (s3.b()) {
            return;
        }
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.c(this.f44960q);
        com.garmin.android.apps.connectmobile.strava.a aVar = this.f44944a;
        if (aVar != null) {
            aVar.f142199a.c(null);
        }
        com.garmin.android.apps.connectmobile.strava.d dVar = this.f44945b;
        if (dVar != null) {
            dVar.f142199a.c(null);
        }
        com.garmin.android.apps.connectmobile.strava.g gVar = this.f44946c;
        if (gVar != null) {
            gVar.f142199a.c(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/strava/StravaConfigActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "FRAG_TAG", "gcm-strava_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
