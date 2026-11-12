package com.garmin.android.apps.connectmobile.social;

import am.c2;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.view.j;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import b71.i;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.o0;
import fo1.s1;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/LegacyCommentsAndLikesActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/social/b$b;", "<init>", "()V", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LegacyCommentsAndLikesActivity extends com.garmin.android.apps.connectmobile.c implements b.InterfaceC0842b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f44483f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f44484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o0 f44485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f44486c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fo1.o0 f44487d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f44488e;

    @Override // android.app.Activity
    public final void finish() {
        String str;
        if (this.f44486c) {
            Intent intent = new Intent();
            intent.putExtra("GCM_conversation_resource_id", this.f44484a);
            intent.putExtra("GCM_conversation_comments_edited_count", this.f44488e);
            setResult(-1, intent);
            fo1.o0 o0Var = this.f44487d;
            if (o0Var == null) {
                s.m("mViewModel");
                throw null;
            }
            if (o0Var.f72656c == c2.ACTIVITY && (str = this.f44484a) != null) {
                ((iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null)).o(this, Long.parseLong(str), false);
            }
        }
        super.finish();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0047  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelableExtra;
        Parcelable parcelable;
        int i14;
        int i15;
        super.onCreate(bundle);
        c2 c2Var = ((c2[]) c2.f3898j.toArray(new c2[0]))[getIntent().getIntExtra("GCM_conversation_resource_type", 0)];
        String stringExtra = getIntent().getStringExtra("GCM_conversation_resource_id");
        String stringExtra2 = getIntent().getStringExtra("GCM_conversation_comment_id");
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT < 33) {
            parcelableExtra = intent != null ? intent.getParcelableExtra("GCM_news_feed_item") : null;
            if (parcelableExtra instanceof Parcelable) {
                parcelable = parcelableExtra;
            } else {
                parcelable = null;
            }
        } else if (intent != null) {
            parcelableExtra = (Parcelable) intent.getParcelableExtra("GCM_news_feed_item", Parcelable.class);
            parcelable = parcelableExtra;
        } else {
            parcelable = null;
        }
        String stringExtra3 = getIntent().getStringExtra("GCM_conversation_owner_display_name");
        boolean z14 = true;
        if (stringExtra3 == null || !stringExtra3.equalsIgnoreCase(((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserDisplayName())) {
            z14 = false;
        }
        fo1.o0 o0Var = (fo1.o0) new x1(getViewModelStore(), new s1(c2Var, stringExtra, stringExtra2, parcelable, z14, false, getIntent().getBooleanExtra("GCM_conversation_open_keyboard", false), true), null, 4, null).b(s0.f105811a.b(fo1.o0.class));
        this.f44487d = o0Var;
        boolean z15 = o0Var.f72662i;
        if (z15) {
            getWindow().setSoftInputMode(21);
        }
        setContentView(R.layout.gcm_news_feed_comments_3_0);
        String action = getIntent().getAction();
        fo1.o0 o0Var2 = this.f44487d;
        if (o0Var2 == null) {
            s.m("mViewModel");
            throw null;
        }
        this.f44484a = o0Var2.f72657d;
        String str = o0Var2.f72658e;
        boolean booleanExtra = getIntent().getBooleanExtra("GCM_challenge_is_vivokid", false);
        fo1.o0 o0Var3 = this.f44487d;
        if (o0Var3 == null) {
            s.m("mViewModel");
            throw null;
        }
        c2 c2Var2 = o0Var3.f72656c;
        if (c2Var2 == null) {
            c2Var2 = c2.ACTIVITY;
        }
        boolean zG = s.g(action, "GCM_action_view_comments_disable_social");
        if (s.g(action, "GCM_action_view_comments") || zG) {
            i14 = 1;
            initActionBar(true, R.string.challenge_comments_tab_label);
            fo1.o0 o0Var4 = this.f44487d;
            if (o0Var4 == null) {
                s.m("mViewModel");
                throw null;
            }
            Parcelable parcelable2 = o0Var4.f72659f;
            String stringExtra4 = getIntent().getStringExtra("GCM_conversation_owner_display_name");
            boolean booleanExtra2 = getIntent().getBooleanExtra("GCM_conversation_allow_detail_view_navigation", true);
            b.a aVar = b.T0;
            String str2 = this.f44484a;
            aVar.getClass();
            c2Var2.getClass();
            Bundle bundle2 = new Bundle();
            bundle2.putString("GCM_conversation_resource_type", c2Var2.name());
            bundle2.putString("GCM_conversation_resource_id", str2);
            bundle2.putString("GCM_conversation_owner_display_name", stringExtra4);
            bundle2.putParcelable("GCM_news_feed_item", parcelable2);
            bundle2.putBoolean("GCM_conversation_open_keyboard", z15);
            bundle2.putBoolean("GCM_conversation_allow_detail_view_navigation", booleanExtra2);
            bundle2.putBoolean("extra_disable_social", zG);
            b bVar = new b();
            bVar.setArguments(bundle2);
            this.f44485b = bVar;
        } else {
            if (s.g(action, "GCM_action_view_likes")) {
                i15 = 1;
                initActionBar(true, R.string.lbl_like);
                c.a aVar2 = c.C;
                String str3 = this.f44484a;
                aVar2.getClass();
                c2Var2.getClass();
                Bundle bundle3 = new Bundle();
                c cVar = new c();
                bundle3.putString("GCM_conversation_resource_type", c2Var2.name());
                bundle3.putString("GCM_conversation_resource_id", str3);
                cVar.setArguments(bundle3);
                this.f44485b = cVar;
            } else {
                if (s.g(action, "GCM_action_view_comment_likes")) {
                    initActionBar(true, R.string.lbl_like);
                    com.garmin.android.apps.connectmobile.social.a.C.getClass();
                    Bundle bundle4 = new Bundle();
                    com.garmin.android.apps.connectmobile.social.a aVar3 = new com.garmin.android.apps.connectmobile.social.a();
                    bundle4.putString("COMMENT_ID", str);
                    bundle4.putBoolean("GCM_challenge_is_vivokid", booleanExtra);
                    aVar3.setArguments(bundle4);
                    this.f44485b = aVar3;
                } else if (s.g(action, "GCM_action_view_group_comments")) {
                    i15 = 1;
                    initActionBar(true, R.string.challenge_comments_tab_label);
                    fo1.o0 o0Var5 = this.f44487d;
                    if (o0Var5 == null) {
                        s.m("mViewModel");
                        throw null;
                    }
                    Parcelable parcelable3 = o0Var5.f72659f;
                    String stringExtra5 = getIntent().getStringExtra("GCM_conversation_owner_display_name");
                    boolean booleanExtra3 = getIntent().getBooleanExtra("GCM_conversation_allow_detail_view_navigation", true);
                    String stringExtra6 = getIntent().getStringExtra("GCM_extra_connection_group_id");
                    String str4 = this.f44484a;
                    int i16 = j10.s.V0;
                    Bundle bundleD = i.d("GCM_extra_connection_group_id", stringExtra6);
                    bundleD.putString("GCM_conversation_resource_type", c2Var2.name());
                    bundleD.putString("GCM_conversation_resource_id", str4);
                    bundleD.putString("GCM_conversation_owner_display_name", stringExtra5);
                    bundleD.putParcelable("GCM_news_feed_item", parcelable3);
                    bundleD.putBoolean("GCM_conversation_open_keyboard", z15);
                    bundleD.putBoolean("GCM_conversation_allow_detail_view_navigation", booleanExtra3);
                    j10.s sVar = new j10.s();
                    sVar.setArguments(bundleD);
                    this.f44485b = sVar;
                }
                i14 = 1;
            }
            i14 = i15;
        }
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        o0 o0Var6 = this.f44485b;
        o0Var6.getClass();
        aVarB.j(R.id.fragment_comments, o0Var6, null, i14);
        aVarB.e();
    }

    @Override // com.garmin.android.apps.connectmobile.social.b.InterfaceC0842b
    public final void r1(int i14) {
        this.f44486c = true;
        this.f44488e = i14;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/LegacyCommentsAndLikesActivity$a;", "", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
