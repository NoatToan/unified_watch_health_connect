package com.garmin.android.apps.connectmobile.training.atp.dashboard;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.m;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import e23.l;
import fw.p;
import o13.h;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/ArticleContentActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ArticleContentActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f45338g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TextView f45339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f45340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f45341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f45342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f45343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w1 f45344f = new w1(s0.f105811a.b(cu1.e.class), new e(this), new d(this), new f(null, this));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f45345a;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f45345a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f45346a;

        public c(l lVar) {
            lVar.getClass();
            this.f45346a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f45346a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45346a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45347a;

        public d(g gVar) {
            this.f45347a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f45347a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f45348a;

        public e(g gVar) {
            this.f45348a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f45348a.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f45349a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f45350b;

        public f(e23.a aVar, g gVar) {
            this.f45349a = aVar;
            this.f45350b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f45349a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f45350b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm4_training_article_content_activity);
        initActionBar(true);
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("ARTICLE_ID_EXTRA") : null;
        if (string == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "ArticleContentActivity", "Missing required article id parameter");
            finish();
            return;
        }
        View viewFindViewById = findViewById(R.id.article_title);
        viewFindViewById.getClass();
        this.f45339a = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.article_banner);
        viewFindViewById2.getClass();
        this.f45340b = (ImageView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.article_date_and_duration);
        viewFindViewById3.getClass();
        this.f45341c = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.article_description);
        viewFindViewById4.getClass();
        this.f45342d = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.article_paragraph);
        viewFindViewById5.getClass();
        this.f45343e = (TextView) viewFindViewById5;
        cu1.e eVar = (cu1.e) this.f45344f.getValue();
        m.a(v1.a(eVar).f183565a, new cu1.f(eVar, string, null), 2).f(this, new c(new com.garmin.android.apps.connectmobile.settings.developersettings.itemstrategy.l(this, 9)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/dashboard/ArticleContentActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ARTICLE_ID_EXTRA", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
