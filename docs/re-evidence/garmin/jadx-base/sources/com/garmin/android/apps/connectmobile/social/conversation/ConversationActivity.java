package com.garmin.android.apps.connectmobile.social.conversation;

import am.c2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f3;
import com.garmin.android.apps.connectmobile.feed.activity.exception.DeletedActivityException;
import com.garmin.android.apps.connectmobile.feed.activity.exception.PrivateActivityException;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import e23.l;
import fe2.z;
import fo1.o0;
import fw.p;
import go1.d0;
import go1.y;
import ho1.o;
import lc.u0;
import o13.h;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import v62.fa;
import v62.z4;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "b", "a", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConversationActivity extends com.garmin.android.apps.connectmobile.c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f44530c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f44531a = new w1(s0.f105811a.b(o0.class), new e(this), new z(this, 3), new f(null, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ComposeView f44532b;

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f44540a;

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
            f44540a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f44541a;

        public d(l lVar) {
            lVar.getClass();
            this.f44541a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f44541a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f44541a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f44542a;

        public e(g gVar) {
            this.f44542a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f44542a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f44543a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f44544b;

        public f(e23.a aVar, g gVar) {
            this.f44543a = aVar;
            this.f44544b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f44543a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f44544b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final o0 ca() {
        return (o0) this.f44531a.getValue();
    }

    public final void da(Exception exc) {
        c2 c2Var = ca().f72656c;
        if (exc instanceof DeletedActivityException) {
            if (c2Var == c2.ACTIVITY) {
                fa(b.a.f44536d);
                return;
            } else {
                if (c2Var == c2.NEWS_POST) {
                    fa(b.C0844b.f44537d);
                    return;
                }
                return;
            }
        }
        if (exc instanceof PrivateActivityException) {
            if (c2Var == c2.ACTIVITY) {
                fa(b.c.f44538d);
                return;
            } else {
                if (c2Var == c2.NEWS_POST) {
                    fa(b.d.f44539d);
                    return;
                }
                return;
            }
        }
        String strH = f3.h(exc, "Unexpected exception=[", "]");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.p(a2Var, "ConversationActivity", strH);
        finish();
    }

    public final void ea(String str, g3<wg0.a> g3Var) {
        int i14 = c.f44540a[g3Var.f35300a.ordinal()];
        if (i14 == 1) {
            showProgressOverlay();
            return;
        }
        if (i14 != 2) {
            if (i14 != 3) {
                u0.r();
                return;
            } else {
                hideProgressOverlay();
                da(g3Var.f35303d);
                return;
            }
        }
        hideProgressOverlay();
        wg0.a aVar = g3Var.f35301b;
        if (aVar == null) {
            finish();
            return;
        }
        ca().f72659f = aVar;
        ca().f72660g = aVar.j();
        d0.a aVar2 = d0.D;
        long j8 = Long.parseLong(str);
        aVar2.getClass();
        d0 d0VarA = d0.a.a(j8);
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        aVarB.j(R.id.conversation_content, d0VarA, null, 1);
        aVarB.e();
    }

    public final void fa(b bVar) {
        String string;
        if (s.g(bVar, b.a.f44536d) || s.g(bVar, b.c.f44538d)) {
            string = getString(R.string.device_screen_activity);
        } else {
            if (!s.g(bVar, b.C0844b.f44537d) && !s.g(bVar, b.d.f44539d)) {
                u0.r();
                return;
            }
            string = getString(R.string.lbl_post);
        }
        setTitle(string);
        ComposeView composeView = this.f44532b;
        if (composeView != null) {
            composeView.setVisibility(0);
        }
        ComposeView composeView2 = this.f44532b;
        if (composeView2 != null) {
            composeView2.setContent(new z3.e(-398500939, true, new fo1.d(bVar, this, 0)));
        }
    }

    @Override // android.app.Activity
    public final void finish() {
        Intent intent;
        Intent intent2 = null;
        intent2 = null;
        if (!ca().I4()) {
            o0 o0VarCa = ca();
            if (o0VarCa.A || o0VarCa.C) {
                intent = new Intent();
                String str = o0VarCa.f72657d;
                intent.putExtra("GCM_conversation_resource_id", str != null ? Long.parseLong(str) : -1L);
                intent.putExtra("GCM_conversation_comments_edited_count", o0VarCa.B);
                intent.putExtra("GCM_conversation_like_modified", o0VarCa.C);
            } else {
                intent = null;
            }
            if (intent != null) {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.b(a2Var, "ConversationActivity", "finish: Comments are modified. Return with modified information.");
                setResult(-1, intent);
                iz0.a aVar2 = (iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null);
                String str2 = ca().f72657d;
                aVar2.o(this, str2 != null ? Long.parseLong(str2) : -1L, false);
            }
        } else if (ca().I4()) {
            o0 o0VarCa2 = ca();
            if (o0VarCa2.I4() && (o0VarCa2.A || o0VarCa2.C)) {
                Intent intent3 = new Intent();
                String str3 = o0VarCa2.f72657d;
                if (str3 == null) {
                    str3 = "";
                }
                intent3.putExtra("GCM_conversation_resource_id", str3);
                c2 c2Var = o0VarCa2.f72656c;
                intent3.putExtra("GCM_conversation_resource_type", c2Var != null ? c2Var.name() : null);
                intent2 = intent3;
            }
            if (intent2 != null) {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.b(a2Var2, "ConversationActivity", "finish: Comments are modified. Return with modified information.");
                setResult(-1, intent2);
            }
        }
        super.finish();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:67:0x0255  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String string;
        Fragment fragmentA;
        Object serializableExtra;
        super.onCreate(bundle);
        if (ca().f72662i) {
            getWindow().setSoftInputMode(21);
        }
        final int i14 = 0;
        dh.b.L(ca().f72672r, this, new d(new fo1.b(this, i14)));
        setContentView(R.layout.conversation_activity);
        this.f44532b = (ComposeView) findViewById(R.id.conversation_social_empty_view);
        String action = getIntent().getAction();
        final int i15 = 1;
        if (action != null) {
            switch (action.hashCode()) {
                case -2064279789:
                    if (!action.equals("GCM_action_view_group_comments")) {
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                        fragmentA = null;
                    } else {
                        long longExtra = getIntent().getLongExtra("GCM_extra_connection_group_id", -1L);
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                        d0.D.getClass();
                        fragmentA = d0.a.a(longExtra);
                    }
                    break;
                case -1302459011:
                    if (!action.equals("GCM_action_view_likes")) {
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                        fragmentA = null;
                    } else {
                        string = getString(R.string.common_likes);
                        string.getClass();
                        ho1.l.a aVar = ho1.l.f84814d;
                        o oVar = o.DEFAULT;
                        aVar.getClass();
                        oVar.getClass();
                        fragmentA = new ho1.l();
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("ARG_TYPE", oVar);
                        fragmentA.setArguments(bundle2);
                    }
                    break;
                case -1039780848:
                    if (action.equals("GCM_action_view_group_post_push_notification_comment")) {
                        String strValueOf = String.valueOf(getIntent().getLongExtra("GCM_extra_connection_group_id", -1L));
                        dh.b.L(ca().E4(this, strValueOf, c2.NEWS_POST), this, new d(new e52.b(22, this, strValueOf)));
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                    } else {
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                    }
                    fragmentA = null;
                    break;
                case -838760667:
                    if (action.equals("action_view_comments_but_activity_not_available")) {
                        string = getString(R.string.common_not_available);
                        string.getClass();
                        Intent intent = getIntent();
                        if (Build.VERSION.SDK_INT >= 33) {
                            serializableExtra = intent != null ? intent.getSerializableExtra("GCM_conversation_activity_not_available_reason", Exception.class) : null;
                        } else {
                            Object serializableExtra2 = intent != null ? intent.getSerializableExtra("GCM_conversation_activity_not_available_reason") : null;
                            if (!(serializableExtra2 instanceof Exception)) {
                                serializableExtra2 = null;
                            }
                            serializableExtra = (Exception) serializableExtra2;
                        }
                        da((Exception) serializableExtra);
                    } else {
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                    }
                    fragmentA = null;
                    break;
                case -788651439:
                    if (action.equals("GCM_action_view_push_notification_comment")) {
                        if (getIntent().getBooleanExtra("is_legacy_activity", false)) {
                            dh.b.L(ca().G4(), this, new d(new fo1.b(this, i15)));
                        } else {
                            o0 o0VarCa = ca();
                            y0 y0Var = new y0();
                            w9.a aVarA = v1.a(o0VarCa);
                            x53.c cVar = o53.s0.f129406a;
                            ge1.b.T(aVarA, x53.b.f189152a, null, new fo1.z0(o0VarCa, y0Var, this, null), 2);
                            dh.b.L(y0Var, this, new d(new fo1.b(this, 2)));
                        }
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                    } else {
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                    }
                    fragmentA = null;
                    break;
                case -703444417:
                    if (action.equals("GCM_action_view_group_activity_push_notification_comment")) {
                        final long longExtra2 = getIntent().getLongExtra("GCM_extra_connection_group_id", -1L);
                        if (getIntent().getBooleanExtra("is_legacy_activity", false)) {
                            dh.b.L(ca().G4(), this, new d(new l(this) { // from class: fo1.c

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ ConversationActivity f72481b;

                                {
                                    this.f72481b = this;
                                }

                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    int i16 = i14;
                                    long j8 = longExtra2;
                                    ConversationActivity conversationActivity = this.f72481b;
                                    g3<wg0.a> g3Var = (g3) obj;
                                    switch (i16) {
                                        case 0:
                                            ConversationActivity.a aVar2 = ConversationActivity.f44530c;
                                            g3Var.getClass();
                                            int i17 = ConversationActivity.c.f44540a[g3Var.f35300a.ordinal()];
                                            if (i17 == 1) {
                                                conversationActivity.showProgressOverlay();
                                            } else if (i17 == 2) {
                                                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = (com.garmin.android.apps.connectmobile.activities.newmodel.h) g3Var.f35301b;
                                                if (hVar != null) {
                                                    conversationActivity.ca().f72659f = hVar;
                                                    conversationActivity.ca().f72660g = hVar.f29451d == ((long) ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
                                                    conversationActivity.setTitle(conversationActivity.getString(R.string.challenge_comments_tab_label));
                                                    go1.d0.D.getClass();
                                                    go1.d0 d0VarA = go1.d0.a.a(j8);
                                                    androidx.fragment.app.v supportFragmentManager = conversationActivity.getSupportFragmentManager();
                                                    androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                                                    aVarB.j(R.id.conversation_content, d0VarA, null, 1);
                                                    aVarB.e();
                                                } else {
                                                    String strN = fb1.c.n("Fetch legacy activity failed, activity id: ", conversationActivity.getIntent().getStringExtra("GCM_conversation_resource_id"));
                                                    i2.a aVar3 = i2.f36769a;
                                                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                    aVar3.getClass();
                                                    i2.a.f(a2Var, "ConversationActivity", strN);
                                                    conversationActivity.finish();
                                                }
                                            } else {
                                                if (i17 != 3) {
                                                    lc.u0.r();
                                                    return null;
                                                }
                                                conversationActivity.hideProgressOverlay();
                                                Exception exc = g3Var.f35303d;
                                                if ((exc instanceof PrivateActivityException) || (exc instanceof DeletedActivityException)) {
                                                    ConversationActivity.f44530c.getClass();
                                                    Intent intent2 = new Intent(conversationActivity, (Class<?>) ConversationActivity.class);
                                                    intent2.setAction("action_view_comments_but_activity_not_available");
                                                    intent2.putExtra("GCM_conversation_activity_not_available_reason", exc);
                                                    conversationActivity.startActivity(intent2);
                                                } else {
                                                    conversationActivity.da(exc);
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            ConversationActivity.a aVar4 = ConversationActivity.f44530c;
                                            g3Var.getClass();
                                            conversationActivity.ea(String.valueOf(j8), g3Var);
                                            return Unit.INSTANCE;
                                    }
                                }
                            }));
                        } else {
                            dh.b.L(ca().E4(this, String.valueOf(longExtra2), c2.ACTIVITY), this, new d(new l(this) { // from class: fo1.c

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ ConversationActivity f72481b;

                                {
                                    this.f72481b = this;
                                }

                                @Override // e23.l
                                public final Object invoke(Object obj) {
                                    int i16 = i15;
                                    long j8 = longExtra2;
                                    ConversationActivity conversationActivity = this.f72481b;
                                    g3<wg0.a> g3Var = (g3) obj;
                                    switch (i16) {
                                        case 0:
                                            ConversationActivity.a aVar2 = ConversationActivity.f44530c;
                                            g3Var.getClass();
                                            int i17 = ConversationActivity.c.f44540a[g3Var.f35300a.ordinal()];
                                            if (i17 == 1) {
                                                conversationActivity.showProgressOverlay();
                                            } else if (i17 == 2) {
                                                com.garmin.android.apps.connectmobile.activities.newmodel.h hVar = (com.garmin.android.apps.connectmobile.activities.newmodel.h) g3Var.f35301b;
                                                if (hVar != null) {
                                                    conversationActivity.ca().f72659f = hVar;
                                                    conversationActivity.ca().f72660g = hVar.f29451d == ((long) ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk());
                                                    conversationActivity.setTitle(conversationActivity.getString(R.string.challenge_comments_tab_label));
                                                    go1.d0.D.getClass();
                                                    go1.d0 d0VarA = go1.d0.a.a(j8);
                                                    androidx.fragment.app.v supportFragmentManager = conversationActivity.getSupportFragmentManager();
                                                    androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
                                                    aVarB.j(R.id.conversation_content, d0VarA, null, 1);
                                                    aVarB.e();
                                                } else {
                                                    String strN = fb1.c.n("Fetch legacy activity failed, activity id: ", conversationActivity.getIntent().getStringExtra("GCM_conversation_resource_id"));
                                                    i2.a aVar3 = i2.f36769a;
                                                    com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.GENERAL;
                                                    aVar3.getClass();
                                                    i2.a.f(a2Var, "ConversationActivity", strN);
                                                    conversationActivity.finish();
                                                }
                                            } else {
                                                if (i17 != 3) {
                                                    lc.u0.r();
                                                    return null;
                                                }
                                                conversationActivity.hideProgressOverlay();
                                                Exception exc = g3Var.f35303d;
                                                if ((exc instanceof PrivateActivityException) || (exc instanceof DeletedActivityException)) {
                                                    ConversationActivity.f44530c.getClass();
                                                    Intent intent2 = new Intent(conversationActivity, (Class<?>) ConversationActivity.class);
                                                    intent2.setAction("action_view_comments_but_activity_not_available");
                                                    intent2.putExtra("GCM_conversation_activity_not_available_reason", exc);
                                                    conversationActivity.startActivity(intent2);
                                                } else {
                                                    conversationActivity.da(exc);
                                                }
                                            }
                                            return Unit.INSTANCE;
                                        default:
                                            ConversationActivity.a aVar4 = ConversationActivity.f44530c;
                                            g3Var.getClass();
                                            conversationActivity.ea(String.valueOf(j8), g3Var);
                                            return Unit.INSTANCE;
                                    }
                                }
                            }));
                        }
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                    } else {
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                    }
                    fragmentA = null;
                    break;
                case 178015034:
                    if (!action.equals("GCM_action_view_group_feed_likes")) {
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                        fragmentA = null;
                    } else {
                        long longExtra3 = getIntent().getLongExtra("GCM_extra_connection_group_id", -1L);
                        string = getString(R.string.common_likes);
                        string.getClass();
                        ho1.l.a aVar2 = ho1.l.f84814d;
                        o oVar2 = o.GROUP_ACTIVITY;
                        aVar2.getClass();
                        oVar2.getClass();
                        ho1.l lVar = new ho1.l();
                        Bundle bundle3 = new Bundle();
                        bundle3.putSerializable("ARG_TYPE", oVar2);
                        bundle3.putLong("ARG_GROUP_ID", longExtra3);
                        lVar.setArguments(bundle3);
                        fragmentA = lVar;
                    }
                    break;
                case 312773277:
                    if (!action.equals("GCM_action_view_comment_likes")) {
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                        fragmentA = null;
                    } else {
                        string = getString(R.string.common_likes);
                        string.getClass();
                        ho1.l.a aVar3 = ho1.l.f84814d;
                        o oVar3 = o.COMMENT;
                        aVar3.getClass();
                        oVar3.getClass();
                        fragmentA = new ho1.l();
                        Bundle bundle4 = new Bundle();
                        bundle4.putSerializable("ARG_TYPE", oVar3);
                        fragmentA.setArguments(bundle4);
                    }
                    break;
                case 1767125139:
                    if (!action.equals("GCM_action_view_comments")) {
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                        fragmentA = null;
                    } else {
                        string = getString(R.string.challenge_comments_tab_label);
                        string.getClass();
                        y.D.getClass();
                        fragmentA = new y();
                    }
                    break;
                default:
                    string = getString(R.string.challenge_comments_tab_label);
                    string.getClass();
                    fragmentA = null;
                    break;
            }
        } else {
            string = getString(R.string.challenge_comments_tab_label);
            string.getClass();
            fragmentA = null;
        }
        initActionBar(true, string);
        if (fragmentA != null) {
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
            aVarB.j(R.id.conversation_content, fragmentA, null, 1);
            aVarB.e();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PARAM_IS_LEGACY_ACTIVITY", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, String str, boolean z14, String str2, boolean z15, boolean z16) {
            context.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) ConversationActivity.class);
            intent.setAction("GCM_action_view_push_notification_comment");
            intent.putExtra("GCM_conversation_resource_type", "ACTIVITY");
            intent.putExtra("GCM_conversation_resource_id", str);
            intent.putExtra("GCM_conversation_should_go_to_last_comment", z14);
            intent.putExtra("GCM_conversation_comment_id", str2);
            intent.putExtra("is_legacy_activity", z15);
            intent.putExtra("GCM_conversation_open_keyboard", z16);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, String str, boolean z14, String str2, boolean z15, int i14) {
            if ((i14 & 16) != 0) {
                z15 = false;
            }
            aVar.getClass();
            return a(context, str, z14, str2, z15, false);
        }

        public static Intent c(Context context, c2 c2Var, String str, wg0.a aVar, boolean z14, boolean z15, boolean z16) {
            c2Var.getClass();
            Intent intent = new Intent(context, (Class<?>) ConversationActivity.class);
            intent.setAction("GCM_action_view_comments");
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, h7.c.a(new o13.p("GCM_conversation_resource_type", c2Var.name()), new o13.p("GCM_conversation_resource_id", str), new o13.p("GCM_news_feed_item", aVar), new o13.p("GCM_conversation_is_my_activity", Boolean.valueOf(z14)), new o13.p("GCM_conversation_open_keyboard", Boolean.valueOf(z15)), new o13.p("GCM_extra_activity_allow_activity_details_navigation", Boolean.valueOf(z16))));
            return intent;
        }

        public static Intent d(Context context, long j8, String str, String str2, boolean z14) {
            context.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) ConversationActivity.class);
            intent.setAction("GCM_action_view_group_activity_push_notification_comment");
            intent.putExtra("GCM_conversation_resource_type", "ACTIVITY");
            intent.putExtra("GCM_extra_connection_group_id", j8);
            intent.putExtra("GCM_conversation_resource_id", str);
            intent.putExtra("GCM_conversation_comment_id", str2);
            intent.putExtra("is_legacy_activity", z14);
            return intent;
        }

        public static /* synthetic */ Intent e(a aVar, Context context, long j8, String str, String str2, int i14) {
            if ((i14 & 8) != 0) {
                str2 = null;
            }
            aVar.getClass();
            return d(context, j8, str, str2, false);
        }

        public static Intent f(m mVar, long j8, c2 c2Var, String str) {
            Intent intent = new Intent(mVar, (Class<?>) ConversationActivity.class);
            intent.setAction("GCM_action_view_group_feed_likes");
            intent.putExtra("GCM_extra_connection_group_id", j8);
            intent.putExtra("GCM_conversation_resource_type", c2Var.name());
            intent.putExtra("GCM_conversation_resource_id", str);
            return intent;
        }

        public static Intent g(Context context, long j8, String str, String str2) {
            context.getClass();
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) ConversationActivity.class);
            intent.setAction("GCM_action_view_group_post_push_notification_comment");
            intent.putExtra("GCM_conversation_resource_type", "NEWS_POST");
            intent.putExtra("GCM_extra_connection_group_id", j8);
            intent.putExtra("GCM_conversation_resource_id", str);
            intent.putExtra("GCM_conversation_comment_id", str2);
            return intent;
        }

        public static Intent h(Activity activity, c2 c2Var, String str) {
            c2Var.getClass();
            str.getClass();
            Intent intent = new Intent(activity, (Class<?>) ConversationActivity.class);
            intent.setAction("GCM_action_view_likes");
            intent.putExtra("GCM_conversation_resource_type", c2Var.name());
            intent.putExtra("GCM_conversation_resource_id", str);
            return intent;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\t\n\u000b\fB!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$b;", "", "Lu4/d;", "imageVector", "", "titleResId", "messageResId", "<init>", "(Lu4/d;II)V", "a", "c", "b", "d", "Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$b$a;", "Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$b$b;", "Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$b$c;", "Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$b$d;", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u4.d f44533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f44534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f44535c;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$b$a;", "Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$b;", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final a f44536d = new a();

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private a() {
                super(fa.a(t62.b.f162798a), R.string.social_unavailable_activity_title, R.string.social_unavailable_activity_right_now_description, null);
                s62.a.f157643a.getClass();
            }
        }

        /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$b$b;", "Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$b;", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C0844b extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final C0844b f44537d = new C0844b();

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private C0844b() {
                super(fa.a(t62.b.f162798a), R.string.social_group_post_unavailable, R.string.social_group_error_loading_post_right_now, null);
                s62.a.f157643a.getClass();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$b$c;", "Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$b;", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final c f44538d = new c();

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private c() {
                super(z4.a(t62.b.f162798a), R.string.social_private_activity_title, R.string.social_private_activity_description, null);
                s62.a.f157643a.getClass();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$b$d;", "Lcom/garmin/android/apps/connectmobile/social/conversation/ConversationActivity$b;", "<init>", "()V", "gcm-domain-social_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final d f44539d = new d();

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private d() {
                super(z4.a(t62.b.f162798a), R.string.social_group_this_post_is_private, R.string.social_group_post_permission_required_message, null);
                s62.a.f157643a.getClass();
            }
        }

        private b(u4.d dVar, int i14, int i15) {
            this.f44533a = dVar;
            this.f44534b = i14;
            this.f44535c = i15;
        }

        public /* synthetic */ b(u4.d dVar, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
            this(dVar, i14, i15);
        }
    }
}
