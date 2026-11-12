package com.garmin.android.apps.connectmobile.leaderboard.challenges;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.UserLevelImageView;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import mt0.f2;
import mt0.q2;
import mt0.r2;
import mt0.t2;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import r22.w1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u0018\u0012\u0004\u0012\u00020\u0002\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00020\u0003R\u00020\u00000\u0001:\u0011\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001aB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u001b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;", "Landroidx/recyclerview/widget/x;", "Lot0/h;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$i;", "", "currentUserDisplayName", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$k;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Ljava/lang/String;Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$k;)V", JWKParameterNames.OCT_KEY_VALUE, "l", IntegerTokenConverter.CONVERTER_KEY, "h", "g", JWKParameterNames.RSA_EXPONENT, "f", "d", "c", "a", "b", "o", JWKParameterNames.RSA_MODULUS, "m", JWKParameterNames.RSA_SECOND_PRIME_FACTOR, "j", "p", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f0 extends androidx.recyclerview.widget.x<ot0.h, i<ot0.h>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f37466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f37467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o13.t f37468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f37469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public o f37470f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f37471g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$a;", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends androidx.recyclerview.widget.o.f<com.garmin.android.apps.connectmobile.leaderboard.model.a0> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var2) {
            a0Var.getClass();
            a0Var2.getClass();
            return true;
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var2) {
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var3 = a0Var;
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var4 = a0Var2;
            a0Var3.getClass();
            a0Var4.getClass();
            return p005kotlin.jvm.internal.s.g(a0Var3.getUuid(), a0Var4.getUuid());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$b;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class b extends RecyclerView.f0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f37472d = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o13.t f37473a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o13.t f37474b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f0 f37475c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f0 f0Var, View view2) {
            super(view2);
            view2.getClass();
            this.f37475c = f0Var;
            final int i14 = 0;
            this.f37473a = o13.m.b(new e23.a(this) { // from class: mt0.p2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.b f120807b;

                {
                    this.f120807b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i15 = i14;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.b bVar = this.f120807b;
                    switch (i15) {
                        case 0:
                            int i16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.b.f37472d;
                            return (ImageView) bVar.itemView.findViewById(R.id.adventure_image);
                        default:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.b.f37472d;
                            return (TextView) bVar.itemView.findViewById(R.id.adventure_name);
                    }
                }
            });
            final int i15 = 1;
            this.f37474b = o13.m.b(new e23.a(this) { // from class: mt0.p2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.b f120807b;

                {
                    this.f120807b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.b bVar = this.f120807b;
                    switch (i16) {
                        case 0:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.b.f37472d;
                            return (ImageView) bVar.itemView.findViewById(R.id.adventure_image);
                        default:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.b.f37472d;
                            return (TextView) bVar.itemView.findViewById(R.id.adventure_name);
                    }
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$c;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$b;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class c extends androidx.recyclerview.widget.x<com.garmin.android.apps.connectmobile.leaderboard.model.a0, b> {
        public c() {
            super(new a());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            b bVar = (b) f0Var;
            bVar.getClass();
            o13.t tVar = bVar.f37473a;
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0VarR = r(i14);
            a0VarR.getClass();
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var = a0VarR;
            Context context = bVar.itemView.getContext();
            f0 f0Var2 = bVar.f37475c;
            if (a0Var.getUuid() == null) {
                vb.h.s("Required value was null.");
                return;
            }
            bVar.itemView.setOnClickListener(new q2(f0Var2, a0Var, 0));
            Context context2 = bVar.itemView.getContext();
            context2.getClass();
            if (c22.b.e(context2)) {
                Context context3 = bVar.itemView.getContext();
                context3.getClass();
                Resources resources = bVar.itemView.getResources();
                resources.getClass();
                int iC = (int) c22.b.c(context3, xy2.b.n(resources, 62.0f), 1.5f);
                Object value = tVar.getValue();
                value.getClass();
                ((ImageView) value).getLayoutParams().height = iC;
                Object value2 = tVar.getValue();
                value2.getClass();
                ((ImageView) value2).getLayoutParams().width = iC;
                Context context4 = bVar.itemView.getContext();
                context4.getClass();
                Resources resources2 = bVar.itemView.getResources();
                resources2.getClass();
                bVar.itemView.getLayoutParams().width = (int) c22.b.c(context4, xy2.b.n(resources2, 80.0f), 1.8f);
            }
            context.getClass();
            zp0.c cVar = new zp0.c(context);
            cVar.f206565e = a0Var.C();
            cVar.f206570j = 2131231129;
            cVar.f206576p = true;
            cVar.f206578r = "cache_availability_today";
            Object value3 = tVar.getValue();
            value3.getClass();
            cVar.h((ImageView) value3);
            Object value4 = bVar.f37474b.getValue();
            value4.getClass();
            ((TextView) value4).setText(a0Var.j());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            return new b(f0.this, n23.j.b(viewGroup, R.layout.leaderboard_adventure_item, viewGroup, false));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$d;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$i;", "Lot0/h$a;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class d extends i<ot0.h.a> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f37477f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o13.t f37478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o13.t f37479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o13.t f37480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f37481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f0 f37482e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f0 f0Var, View view2) {
            super(f0Var, view2);
            view2.getClass();
            this.f37482e = f0Var;
            final int i14 = 0;
            o13.t tVarB = o13.m.b(new e23.a(this) { // from class: mt0.s2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d f120855b;

                {
                    this.f120855b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i15 = i14;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d dVar = this.f120855b;
                    switch (i15) {
                        case 0:
                            int i16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d.f37477f;
                            return (RecyclerView) dVar.itemView.findViewById(R.id.rv_available_adventures);
                        case 1:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d.f37477f;
                            return (TextView) dVar.itemView.findViewById(R.id.see_all);
                        default:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d.f37477f;
                            return (TextView) dVar.itemView.findViewById(R.id.available_adventure_header);
                    }
                }
            });
            final int i15 = 1;
            this.f37478a = o13.m.b(new e23.a(this) { // from class: mt0.s2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d f120855b;

                {
                    this.f120855b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d dVar = this.f120855b;
                    switch (i16) {
                        case 0:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d.f37477f;
                            return (RecyclerView) dVar.itemView.findViewById(R.id.rv_available_adventures);
                        case 1:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d.f37477f;
                            return (TextView) dVar.itemView.findViewById(R.id.see_all);
                        default:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d.f37477f;
                            return (TextView) dVar.itemView.findViewById(R.id.available_adventure_header);
                    }
                }
            });
            final int i16 = 2;
            this.f37479b = o13.m.b(new e23.a(this) { // from class: mt0.s2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d f120855b;

                {
                    this.f120855b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i17 = i16;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d dVar = this.f120855b;
                    switch (i17) {
                        case 0:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d.f37477f;
                            return (RecyclerView) dVar.itemView.findViewById(R.id.rv_available_adventures);
                        case 1:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d.f37477f;
                            return (TextView) dVar.itemView.findViewById(R.id.see_all);
                        default:
                            int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.d.f37477f;
                            return (TextView) dVar.itemView.findViewById(R.id.available_adventure_header);
                    }
                }
            });
            o13.t tVarB2 = o13.m.b(new t2(f0Var, 0));
            this.f37480c = tVarB2;
            this.f37481d = this.itemView.getContext();
            Object value = tVarB.getValue();
            value.getClass();
            RecyclerView recyclerView = (RecyclerView) value;
            recyclerView.setAdapter((c) tVarB2.getValue());
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.addItemDecoration(new w1(0, recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.spacing_normal), recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.spacing_micro)));
        }

        @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.i
        public final void d(ot0.h hVar) {
            Object value = this.f37479b.getValue();
            value.getClass();
            Context context = this.f37481d;
            ((TextView) value).setContentDescription(context.getString(R.string.lbl_heading, context.getString(R.string.social_available_expeditions_title)));
            Object value2 = this.f37478a.getValue();
            value2.getClass();
            ((TextView) value2).setOnClickListener(new r2(this.f37482e, 0));
            ((c) this.f37480c.getValue()).t(((ot0.h.a) hVar).f133751a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$e;", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e extends androidx.recyclerview.widget.o.f<com.garmin.android.apps.connectmobile.leaderboard.model.a0> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var2) {
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var3 = a0Var;
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var4 = a0Var2;
            a0Var3.getClass();
            a0Var4.getClass();
            return p005kotlin.jvm.internal.s.g(a0Var3.getJoinable(), a0Var4.getJoinable());
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var2) {
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var3 = a0Var;
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var4 = a0Var2;
            a0Var3.getClass();
            a0Var4.getClass();
            return p005kotlin.jvm.internal.s.g(a0Var3.getUuid(), a0Var4.getUuid());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$f;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class f extends RecyclerView.f0 {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int f37483i = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o13.t f37484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o13.t f37485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o13.t f37486c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o13.t f37487d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final o13.t f37488e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final o13.t f37489f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final o13.t f37490g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ f0 f37491h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(f0 f0Var, View view2) {
            super(view2);
            view2.getClass();
            this.f37491h = f0Var;
            final int i14 = 0;
            this.f37484a = o13.m.b(new e23.a(this) { // from class: mt0.u2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f f120887b;

                {
                    this.f120887b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i15 = i14;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f fVar = this.f120887b;
                    switch (i15) {
                        case 0:
                            int i16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.inflated_point_image);
                        case 1:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.badge_image);
                        case 2:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_name);
                        case 3:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_duration);
                        case 4:
                            int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ComposeView) fVar.itemView.findViewById(R.id.badge_join_compose);
                        case 5:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (LinearLayout) fVar.itemView.findViewById(R.id.simple_info_container);
                        default:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            Context context = fVar.itemView.getContext();
                            context.getClass();
                            return new pi0.e(context);
                    }
                }
            });
            final int i15 = 1;
            this.f37485b = o13.m.b(new e23.a(this) { // from class: mt0.u2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f f120887b;

                {
                    this.f120887b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f fVar = this.f120887b;
                    switch (i16) {
                        case 0:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.inflated_point_image);
                        case 1:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.badge_image);
                        case 2:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_name);
                        case 3:
                            int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_duration);
                        case 4:
                            int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ComposeView) fVar.itemView.findViewById(R.id.badge_join_compose);
                        case 5:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (LinearLayout) fVar.itemView.findViewById(R.id.simple_info_container);
                        default:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            Context context = fVar.itemView.getContext();
                            context.getClass();
                            return new pi0.e(context);
                    }
                }
            });
            final int i16 = 2;
            this.f37486c = o13.m.b(new e23.a(this) { // from class: mt0.u2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f f120887b;

                {
                    this.f120887b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i17 = i16;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f fVar = this.f120887b;
                    switch (i17) {
                        case 0:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.inflated_point_image);
                        case 1:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.badge_image);
                        case 2:
                            int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_name);
                        case 3:
                            int i111 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_duration);
                        case 4:
                            int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ComposeView) fVar.itemView.findViewById(R.id.badge_join_compose);
                        case 5:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (LinearLayout) fVar.itemView.findViewById(R.id.simple_info_container);
                        default:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            Context context = fVar.itemView.getContext();
                            context.getClass();
                            return new pi0.e(context);
                    }
                }
            });
            final int i17 = 3;
            this.f37487d = o13.m.b(new e23.a(this) { // from class: mt0.u2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f f120887b;

                {
                    this.f120887b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i18 = i17;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f fVar = this.f120887b;
                    switch (i18) {
                        case 0:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.inflated_point_image);
                        case 1:
                            int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.badge_image);
                        case 2:
                            int i111 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_name);
                        case 3:
                            int i112 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_duration);
                        case 4:
                            int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ComposeView) fVar.itemView.findViewById(R.id.badge_join_compose);
                        case 5:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (LinearLayout) fVar.itemView.findViewById(R.id.simple_info_container);
                        default:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            Context context = fVar.itemView.getContext();
                            context.getClass();
                            return new pi0.e(context);
                    }
                }
            });
            final int i18 = 4;
            this.f37488e = o13.m.b(new e23.a(this) { // from class: mt0.u2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f f120887b;

                {
                    this.f120887b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i19 = i18;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f fVar = this.f120887b;
                    switch (i19) {
                        case 0:
                            int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.inflated_point_image);
                        case 1:
                            int i111 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.badge_image);
                        case 2:
                            int i112 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_name);
                        case 3:
                            int i113 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_duration);
                        case 4:
                            int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ComposeView) fVar.itemView.findViewById(R.id.badge_join_compose);
                        case 5:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (LinearLayout) fVar.itemView.findViewById(R.id.simple_info_container);
                        default:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            Context context = fVar.itemView.getContext();
                            context.getClass();
                            return new pi0.e(context);
                    }
                }
            });
            final int i19 = 5;
            this.f37489f = o13.m.b(new e23.a(this) { // from class: mt0.u2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f f120887b;

                {
                    this.f120887b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i110 = i19;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f fVar = this.f120887b;
                    switch (i110) {
                        case 0:
                            int i111 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.inflated_point_image);
                        case 1:
                            int i112 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.badge_image);
                        case 2:
                            int i113 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_name);
                        case 3:
                            int i114 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_duration);
                        case 4:
                            int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ComposeView) fVar.itemView.findViewById(R.id.badge_join_compose);
                        case 5:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (LinearLayout) fVar.itemView.findViewById(R.id.simple_info_container);
                        default:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            Context context = fVar.itemView.getContext();
                            context.getClass();
                            return new pi0.e(context);
                    }
                }
            });
            final int i24 = 6;
            this.f37490g = o13.m.b(new e23.a(this) { // from class: mt0.u2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f f120887b;

                {
                    this.f120887b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i110 = i24;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f fVar = this.f120887b;
                    switch (i110) {
                        case 0:
                            int i111 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.inflated_point_image);
                        case 1:
                            int i112 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ImageView) fVar.itemView.findViewById(R.id.badge_image);
                        case 2:
                            int i113 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_name);
                        case 3:
                            int i114 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (TextView) fVar.itemView.findViewById(R.id.badge_duration);
                        case 4:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (ComposeView) fVar.itemView.findViewById(R.id.badge_join_compose);
                        case 5:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            return (LinearLayout) fVar.itemView.findViewById(R.id.simple_info_container);
                        default:
                            int i27 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.f.f37483i;
                            Context context = fVar.itemView.getContext();
                            context.getClass();
                            return new pi0.e(context);
                    }
                }
            });
        }

        public final void d(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, boolean z14) {
            String string;
            Context context = this.itemView.getContext();
            if (a0Var.getUuid() == null || a0Var.getBadgeId() == null) {
                return;
            }
            View view2 = this.itemView;
            f0 f0Var = this.f37491h;
            view2.setOnClickListener(new q2(f0Var, a0Var, 1));
            Object value = this.f37484a.getValue();
            value.getClass();
            v22.e.r((ImageView) value, z14 && a0Var.t());
            context.getClass();
            zp0.c cVar = new zp0.c(context);
            cVar.f206565e = a0Var.C();
            cVar.f206570j = 2131231129;
            cVar.f206576p = true;
            cVar.f206578r = "cache_availability_today";
            Object value2 = this.f37485b.getValue();
            value2.getClass();
            cVar.h((ImageView) value2);
            Object value3 = this.f37486c.getValue();
            value3.getClass();
            ((TextView) value3).setText(a0Var.j());
            Object value4 = this.f37487d.getValue();
            value4.getClass();
            TextView textView = (TextView) value4;
            if (a0Var.getStartDate() == null || a0Var.getEndDate() == null) {
                x xVar = x.f37955a;
                DateTime startDate = a0Var.getStartDate();
                xVar.getClass();
                DateTimeFormatter dateTimeFormatterForPattern = DateTimeFormat.forPattern("MMMM d");
                dateTimeFormatterForPattern.getClass();
                string = context.getString(R.string.lbl_value1_to_value2, c22.j0.h(startDate, dateTimeFormatterForPattern), com.nimbusds.jose.shaded.gson.internal.a.i("MMMM d", a0Var.getEndDate()));
            } else {
                string = ((pi0.e) this.f37490g.getValue()).l(a0Var.getStartDate(), a0Var.getEndDate(), pi0.f.SHORT_MONTH_NO_WEEKDAY);
            }
            textView.setText(string);
            boolean z15 = a0Var.j0() && !z14;
            x xVar2 = x.f37955a;
            boolean z16 = a0Var.f() == com.garmin.android.apps.connectmobile.leaderboard.model.r.FULL;
            Boolean joinable = a0Var.getJoinable();
            Object value5 = this.f37488e.getValue();
            value5.getClass();
            kk1.a aVar = new kk1.a(f0Var, 21, context, a0Var);
            xVar2.getClass();
            ((ComposeView) value5).setContent(new z3.e(1181535624, true, new mt0.w1(z16, joinable, aVar, z15, 0)));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00040\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$g;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$f;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class g extends androidx.recyclerview.widget.x<com.garmin.android.apps.connectmobile.leaderboard.model.a0, f> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f37492b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Integer f37493c;

        public g() {
            super(new e());
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            f fVar = (f) f0Var;
            fVar.getClass();
            Integer num = this.f37493c;
            if (num != null) {
                int iIntValue = num.intValue();
                Object value = fVar.f37489f.getValue();
                value.getClass();
                ((LinearLayout) value).getLayoutParams().height = iIntValue;
            }
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0VarR = r(i14);
            a0VarR.getClass();
            fVar.d(a0VarR, this.f37492b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            return new f(f0.this, n23.j.b(viewGroup, R.layout.leaderboard_badge_challenge_item, viewGroup, false));
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$h;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$i;", "Lot0/h$b;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class h extends i<ot0.h.b> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ int f37495g = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o13.t f37496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o13.t f37497b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o13.t f37498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f37499d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f37500e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ f0 f37501f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(f0 f0Var, View view2) {
            super(f0Var, view2);
            view2.getClass();
            this.f37501f = f0Var;
            final int i14 = 0;
            o13.t tVarB = o13.m.b(new e23.a(this) { // from class: mt0.v2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h f120895b;

                {
                    this.f120895b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i15 = i14;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h hVar = this.f120895b;
                    switch (i15) {
                        case 0:
                            int i16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h.f37495g;
                            return (RecyclerView) hVar.itemView.findViewById(R.id.rv_available_challenges);
                        case 1:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h.f37495g;
                            return (TextView) hVar.itemView.findViewById(R.id.see_all);
                        default:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h.f37495g;
                            return (TextView) hVar.itemView.findViewById(R.id.available_badge_header);
                    }
                }
            });
            final int i15 = 1;
            this.f37496a = o13.m.b(new e23.a(this) { // from class: mt0.v2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h f120895b;

                {
                    this.f120895b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h hVar = this.f120895b;
                    switch (i16) {
                        case 0:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h.f37495g;
                            return (RecyclerView) hVar.itemView.findViewById(R.id.rv_available_challenges);
                        case 1:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h.f37495g;
                            return (TextView) hVar.itemView.findViewById(R.id.see_all);
                        default:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h.f37495g;
                            return (TextView) hVar.itemView.findViewById(R.id.available_badge_header);
                    }
                }
            });
            final int i16 = 2;
            this.f37497b = o13.m.b(new e23.a(this) { // from class: mt0.v2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h f120895b;

                {
                    this.f120895b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i17 = i16;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h hVar = this.f120895b;
                    switch (i17) {
                        case 0:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h.f37495g;
                            return (RecyclerView) hVar.itemView.findViewById(R.id.rv_available_challenges);
                        case 1:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h.f37495g;
                            return (TextView) hVar.itemView.findViewById(R.id.see_all);
                        default:
                            int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.h.f37495g;
                            return (TextView) hVar.itemView.findViewById(R.id.available_badge_header);
                    }
                }
            });
            o13.t tVarB2 = o13.m.b(new t2(f0Var, 1));
            this.f37498c = tVarB2;
            this.f37499d = this.itemView.getContext();
            this.f37500e = 140;
            Object value = tVarB.getValue();
            value.getClass();
            RecyclerView recyclerView = (RecyclerView) value;
            recyclerView.setAdapter((g) tVarB2.getValue());
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
            recyclerView.addItemDecoration(new w1(0, recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.spacing_normal), recyclerView.getContext().getResources().getDimensionPixelSize(R.dimen.spacing_micro)));
        }

        @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.i
        public final void d(ot0.h hVar) {
            Object next;
            List<com.garmin.android.apps.connectmobile.leaderboard.model.a0> list = ((ot0.h.b) hVar).f133753a;
            boolean zIsEmpty = list.isEmpty();
            o13.t tVar = this.f37498c;
            f0 f0Var = this.f37501f;
            Context context = this.f37499d;
            if (!zIsEmpty) {
                Iterator<T> it = list.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int length = ((com.garmin.android.apps.connectmobile.leaderboard.model.a0) next).j().length();
                        do {
                            Object next2 = it.next();
                            int length2 = ((com.garmin.android.apps.connectmobile.leaderboard.model.a0) next2).j().length();
                            if (length < length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.a0) next;
                context.getClass();
                if (a0Var == null) {
                    return;
                }
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.leaderboard_badge_challenge_item, (ViewGroup) null);
                viewInflate.getClass();
                new f(f0Var, viewInflate).d(a0Var, false);
                LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.simple_info_container);
                linearLayout.measure(View.MeasureSpec.makeMeasureSpec(fb2.g.e(this.f37500e, context), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                Integer numValueOf = Integer.valueOf(linearLayout.getMeasuredHeight());
                g gVar = (g) tVar.getValue();
                if (!p005kotlin.jvm.internal.s.g(gVar.f37493c, numValueOf)) {
                    Integer num = gVar.f37493c;
                    gVar.f37493c = numValueOf;
                    if (num != null) {
                        gVar.notifyDataSetChanged();
                    }
                }
            }
            Object value = this.f37497b.getValue();
            value.getClass();
            ((TextView) value).setContentDescription(context.getString(R.string.lbl_heading, context.getString(R.string.social_available_challenges_title)));
            Object value2 = this.f37496a.getValue();
            value2.getClass();
            ((TextView) value2).setOnClickListener(new r2(f0Var, 1));
            ((g) tVar.getValue()).t(list);
        }

        public final void e(boolean z14) {
            g gVar = (g) this.f37498c.getValue();
            gVar.f37492b = z14;
            Collection collection = gVar.f10698a.f10426f;
            collection.getClass();
            int i14 = 0;
            for (Object obj : collection) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.a0) obj;
                if (a0Var.j0() || a0Var.t()) {
                    gVar.notifyItemChanged(i14);
                }
                i14 = i15;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0096\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$i;", "Lot0/h;", "T", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public class i<T extends ot0.h> extends RecyclerView.f0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f0 f0Var, View view2) {
            super(view2);
            view2.getClass();
        }

        public void d(T t7) {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$j;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$i;", "Lot0/h$c;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class j extends i<ot0.h.c> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ int f37502e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o13.t f37503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o13.t f37504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o13.t f37505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ f0 f37506d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(f0 f0Var, View view2) {
            super(f0Var, view2);
            view2.getClass();
            this.f37506d = f0Var;
            final int i14 = 0;
            this.f37503a = o13.m.b(new e23.a(this) { // from class: mt0.w2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j f120911b;

                {
                    this.f120911b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i15 = i14;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j jVar = this.f120911b;
                    switch (i15) {
                        case 0:
                            int i16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j.f37502e;
                            return (TextView) jVar.itemView.findViewById(R.id.create_new_challenge);
                        case 1:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j.f37502e;
                            return (TextView) jVar.itemView.findViewById(R.id.join_weekly_steps_challenge);
                        default:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j.f37502e;
                            return (TextView) jVar.itemView.findViewById(R.id.all_past_challenge);
                    }
                }
            });
            final int i15 = 1;
            this.f37504b = o13.m.b(new e23.a(this) { // from class: mt0.w2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j f120911b;

                {
                    this.f120911b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j jVar = this.f120911b;
                    switch (i16) {
                        case 0:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j.f37502e;
                            return (TextView) jVar.itemView.findViewById(R.id.create_new_challenge);
                        case 1:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j.f37502e;
                            return (TextView) jVar.itemView.findViewById(R.id.join_weekly_steps_challenge);
                        default:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j.f37502e;
                            return (TextView) jVar.itemView.findViewById(R.id.all_past_challenge);
                    }
                }
            });
            final int i16 = 2;
            this.f37505c = o13.m.b(new e23.a(this) { // from class: mt0.w2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j f120911b;

                {
                    this.f120911b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i17 = i16;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j jVar = this.f120911b;
                    switch (i17) {
                        case 0:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j.f37502e;
                            return (TextView) jVar.itemView.findViewById(R.id.create_new_challenge);
                        case 1:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j.f37502e;
                            return (TextView) jVar.itemView.findViewById(R.id.join_weekly_steps_challenge);
                        default:
                            int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.j.f37502e;
                            return (TextView) jVar.itemView.findViewById(R.id.all_past_challenge);
                    }
                }
            });
        }

        @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.i
        public final void d(ot0.h hVar) {
            Object value = this.f37503a.getValue();
            value.getClass();
            f0 f0Var = this.f37506d;
            ((TextView) value).setOnClickListener(new r2(f0Var, 2));
            o13.t tVar = this.f37504b;
            Object value2 = tVar.getValue();
            value2.getClass();
            ((TextView) value2).setVisibility(((ot0.h.c) hVar).f133755a ? 8 : 0);
            Object value3 = tVar.getValue();
            value3.getClass();
            ((TextView) value3).setOnClickListener(new r2(f0Var, 3));
            Object value4 = this.f37505c.getValue();
            value4.getClass();
            ((TextView) value4).setOnClickListener(new r2(f0Var, 4));
        }
    }

    public interface k {
        void A2(Context context, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var);

        void D4();

        void N3(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var);

        void W1();

        void W4(String str);

        void Y4();

        void Y5();

        void e0();

        void k5();

        void n1();

        void p(String str);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$l;", "Landroidx/recyclerview/widget/o$f;", "Lot0/h;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class l extends androidx.recyclerview.widget.o.f<ot0.h> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(ot0.h hVar, ot0.h hVar2) {
            ot0.h hVar3 = hVar;
            ot0.h hVar4 = hVar2;
            hVar3.getClass();
            hVar4.getClass();
            return hVar3.equals(hVar4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(ot0.h hVar, ot0.h hVar2) {
            ot0.h hVar3 = hVar;
            ot0.h hVar4 = hVar2;
            hVar3.getClass();
            hVar4.getClass();
            return hVar3.getF133762c() == hVar4.getF133762c();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$m;", "Landroidx/recyclerview/widget/o$f;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "<init>", "()V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class m extends androidx.recyclerview.widget.o.f<com.garmin.android.apps.connectmobile.leaderboard.model.a0> {
        @Override // androidx.recyclerview.widget.o.f
        public final boolean a(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var2) {
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var3 = a0Var;
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var4 = a0Var2;
            a0Var3.getClass();
            a0Var4.getClass();
            return a0Var3.equals(a0Var4);
        }

        @Override // androidx.recyclerview.widget.o.f
        public final boolean b(com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var, com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var2) {
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var3 = a0Var;
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var4 = a0Var2;
            a0Var3.getClass();
            a0Var4.getClass();
            return p005kotlin.jvm.internal.s.g(a0Var3.getUuid(), a0Var4.getUuid());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$n;", "Landroidx/recyclerview/widget/x;", "Lcom/garmin/android/apps/connectmobile/leaderboard/model/a0;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/n0;", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class n extends androidx.recyclerview.widget.x<com.garmin.android.apps.connectmobile.leaderboard.model.a0, n0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f37507b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final mh1.x f37508c;

        public n() {
            super(new m());
            this.f37508c = new mh1.x(f0.this, 9);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
            n0 n0Var = (n0) f0Var;
            n0Var.getClass();
            com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0VarR = r(i14);
            f0 f0Var2 = f0.this;
            n0Var.d(a0VarR, f0Var2.f37466b, (gg1.o0) f0Var2.f37468d.getValue(), this.f37507b);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
            viewGroup.getClass();
            n0.f37680l.getClass();
            mh1.x xVar = this.f37508c;
            xVar.getClass();
            View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.leaderboard_challenges_list_item, viewGroup, false);
            viewInflate.getClass();
            return new n0(viewInflate, xVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$o;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$i;", "Lot0/h$d;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class o extends i<ot0.h.d> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ int f37510f = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o13.t f37511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o13.t f37512b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o13.t f37513c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f37514d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f0 f37515e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(f0 f0Var, View view2) {
            super(f0Var, view2);
            view2.getClass();
            this.f37515e = f0Var;
            final int i14 = 0;
            o13.t tVarB = o13.m.b(new e23.a(this) { // from class: mt0.x2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o f120922b;

                {
                    this.f120922b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i15 = i14;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o oVar = this.f120922b;
                    switch (i15) {
                        case 0:
                            int i16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o.f37510f;
                            return (RecyclerView) oVar.itemView.findViewById(R.id.rv_my_challenges);
                        case 1:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o.f37510f;
                            return (TextView) oVar.itemView.findViewById(R.id.see_all);
                        default:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o.f37510f;
                            return (TextView) oVar.itemView.findViewById(R.id.my_challenges_header);
                    }
                }
            });
            final int i15 = 1;
            this.f37511a = o13.m.b(new e23.a(this) { // from class: mt0.x2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o f120922b;

                {
                    this.f120922b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o oVar = this.f120922b;
                    switch (i16) {
                        case 0:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o.f37510f;
                            return (RecyclerView) oVar.itemView.findViewById(R.id.rv_my_challenges);
                        case 1:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o.f37510f;
                            return (TextView) oVar.itemView.findViewById(R.id.see_all);
                        default:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o.f37510f;
                            return (TextView) oVar.itemView.findViewById(R.id.my_challenges_header);
                    }
                }
            });
            final int i16 = 2;
            this.f37512b = o13.m.b(new e23.a(this) { // from class: mt0.x2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o f120922b;

                {
                    this.f120922b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i17 = i16;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o oVar = this.f120922b;
                    switch (i17) {
                        case 0:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o.f37510f;
                            return (RecyclerView) oVar.itemView.findViewById(R.id.rv_my_challenges);
                        case 1:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o.f37510f;
                            return (TextView) oVar.itemView.findViewById(R.id.see_all);
                        default:
                            int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.o.f37510f;
                            return (TextView) oVar.itemView.findViewById(R.id.my_challenges_header);
                    }
                }
            });
            o13.t tVarB2 = o13.m.b(new t2(f0Var, 2));
            this.f37513c = tVarB2;
            this.f37514d = this.itemView.getContext();
            Object value = tVarB.getValue();
            value.getClass();
            RecyclerView recyclerView = (RecyclerView) value;
            recyclerView.setAdapter((n) tVarB2.getValue());
            recyclerView.setNestedScrollingEnabled(false);
            recyclerView.setLayoutManager(new LinearLayoutManager(this.itemView.getContext(), 1, false));
        }

        @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.i
        public final void d(ot0.h hVar) {
            Object value = this.f37512b.getValue();
            value.getClass();
            Context context = this.f37514d;
            ((TextView) value).setContentDescription(context.getString(R.string.lbl_heading, context.getString(R.string.social_my_challenges)));
            Object value2 = this.f37511a.getValue();
            value2.getClass();
            ((TextView) value2).setOnClickListener(new r2(this.f37515e, 5));
            ((n) this.f37513c.getValue()).t(((ot0.h.d) hVar).f133757a);
        }

        public final void e(boolean z14) {
            n nVar = (n) this.f37513c.getValue();
            nVar.f37507b = z14;
            Collection collection = nVar.f10698a.f10426f;
            collection.getClass();
            int i14 = 0;
            for (Object obj : collection) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                com.garmin.android.apps.connectmobile.leaderboard.model.a0 a0Var = (com.garmin.android.apps.connectmobile.leaderboard.model.a0) obj;
                if (a0Var.j0() || a0Var.t()) {
                    nVar.notifyItemChanged(i14);
                }
                i14 = i15;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$p;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$i;", "Lot0/h$e;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class p extends i<ot0.h.e> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int f37516b = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o13.t f37517a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(f0 f0Var, View view2) {
            super(f0Var, view2);
            view2.getClass();
            this.f37517a = o13.m.b(new mh1.i(this, 13));
        }

        @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.i
        public final void d(ot0.h hVar) {
            Object value = this.f37517a.getValue();
            value.getClass();
            f2.f120594a.getClass();
            ((ComposeView) value).setContent(f2.f120596c);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001R\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$q;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0$i;", "Lot0/h$f;", "Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;", "Landroid/view/View;", "view", "<init>", "(Lcom/garmin/android/apps/connectmobile/leaderboard/challenges/f0;Landroid/view/View;)V", "gcm-challenges_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class q extends i<ot0.h.f> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ int f37518i = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o13.t f37519a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final o13.t f37520b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final o13.t f37521c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final o13.t f37522d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final o13.t f37523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final o13.t f37524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final o13.t f37525g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ f0 f37526h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(f0 f0Var, View view2) {
            super(f0Var, view2);
            view2.getClass();
            this.f37526h = f0Var;
            final int i14 = 0;
            this.f37519a = o13.m.b(new e23.a(this) { // from class: mt0.y2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q f120937b;

                {
                    this.f120937b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i15 = i14;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q qVar = this.f120937b;
                    switch (i15) {
                        case 0:
                            int i16 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.challenge_icon);
                        case 1:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (UserLevelImageView) qVar.itemView.findViewById(R.id.user_profile);
                        case 2:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_name);
                        case 3:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_status);
                        case 4:
                            int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_players);
                        case 5:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_weekly);
                        default:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.exit_to_app_icon);
                    }
                }
            });
            final int i15 = 1;
            this.f37520b = o13.m.b(new e23.a(this) { // from class: mt0.y2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q f120937b;

                {
                    this.f120937b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i16 = i15;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q qVar = this.f120937b;
                    switch (i16) {
                        case 0:
                            int i17 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.challenge_icon);
                        case 1:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (UserLevelImageView) qVar.itemView.findViewById(R.id.user_profile);
                        case 2:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_name);
                        case 3:
                            int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_status);
                        case 4:
                            int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_players);
                        case 5:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_weekly);
                        default:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.exit_to_app_icon);
                    }
                }
            });
            final int i16 = 2;
            this.f37521c = o13.m.b(new e23.a(this) { // from class: mt0.y2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q f120937b;

                {
                    this.f120937b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i17 = i16;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q qVar = this.f120937b;
                    switch (i17) {
                        case 0:
                            int i18 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.challenge_icon);
                        case 1:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (UserLevelImageView) qVar.itemView.findViewById(R.id.user_profile);
                        case 2:
                            int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_name);
                        case 3:
                            int i111 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_status);
                        case 4:
                            int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_players);
                        case 5:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_weekly);
                        default:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.exit_to_app_icon);
                    }
                }
            });
            final int i17 = 3;
            this.f37522d = o13.m.b(new e23.a(this) { // from class: mt0.y2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q f120937b;

                {
                    this.f120937b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i18 = i17;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q qVar = this.f120937b;
                    switch (i18) {
                        case 0:
                            int i19 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.challenge_icon);
                        case 1:
                            int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (UserLevelImageView) qVar.itemView.findViewById(R.id.user_profile);
                        case 2:
                            int i111 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_name);
                        case 3:
                            int i112 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_status);
                        case 4:
                            int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_players);
                        case 5:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_weekly);
                        default:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.exit_to_app_icon);
                    }
                }
            });
            final int i18 = 4;
            this.f37523e = o13.m.b(new e23.a(this) { // from class: mt0.y2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q f120937b;

                {
                    this.f120937b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i19 = i18;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q qVar = this.f120937b;
                    switch (i19) {
                        case 0:
                            int i110 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.challenge_icon);
                        case 1:
                            int i111 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (UserLevelImageView) qVar.itemView.findViewById(R.id.user_profile);
                        case 2:
                            int i112 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_name);
                        case 3:
                            int i113 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_status);
                        case 4:
                            int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_players);
                        case 5:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_weekly);
                        default:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.exit_to_app_icon);
                    }
                }
            });
            final int i19 = 5;
            this.f37524f = o13.m.b(new e23.a(this) { // from class: mt0.y2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q f120937b;

                {
                    this.f120937b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i110 = i19;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q qVar = this.f120937b;
                    switch (i110) {
                        case 0:
                            int i111 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.challenge_icon);
                        case 1:
                            int i112 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (UserLevelImageView) qVar.itemView.findViewById(R.id.user_profile);
                        case 2:
                            int i113 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_name);
                        case 3:
                            int i114 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_status);
                        case 4:
                            int i24 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_players);
                        case 5:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_weekly);
                        default:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.exit_to_app_icon);
                    }
                }
            });
            final int i24 = 6;
            this.f37525g = o13.m.b(new e23.a(this) { // from class: mt0.y2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q f120937b;

                {
                    this.f120937b = this;
                }

                @Override // e23.a
                public final Object invoke() {
                    int i110 = i24;
                    com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q qVar = this.f120937b;
                    switch (i110) {
                        case 0:
                            int i111 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.challenge_icon);
                        case 1:
                            int i112 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (UserLevelImageView) qVar.itemView.findViewById(R.id.user_profile);
                        case 2:
                            int i113 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_name);
                        case 3:
                            int i114 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_status);
                        case 4:
                            int i25 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_players);
                        case 5:
                            int i26 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (TextView) qVar.itemView.findViewById(R.id.challenge_weekly);
                        default:
                            int i27 = com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.q.f37518i;
                            return (ImageView) qVar.itemView.findViewById(R.id.exit_to_app_icon);
                    }
                }
            });
        }

        @Override // com.garmin.android.apps.connectmobile.leaderboard.challenges.f0.i
        public final void d(ot0.h hVar) {
            ot0.h.f fVar = (ot0.h.f) hVar;
            Context context = this.itemView.getContext();
            this.itemView.setOnClickListener(new r2(this.f37526h, 6));
            Object value = this.f37519a.getValue();
            value.getClass();
            ((ImageView) value).setVisibility(8);
            o13.t tVar = this.f37520b;
            Object value2 = tVar.getValue();
            value2.getClass();
            ((UserLevelImageView) value2).setVisibility(0);
            Object value3 = tVar.getValue();
            value3.getClass();
            ((UserLevelImageView) value3).setProfileImageData(fVar.f133761b);
            o13.t tVar2 = this.f37521c;
            Object value4 = tVar2.getValue();
            value4.getClass();
            ((TextView) value4).setVisibility(0);
            Object value5 = tVar2.getValue();
            value5.getClass();
            ((TextView) value5).setText(context.getString(R.string.social_weekly_leaderboard));
            o13.t tVar3 = this.f37523e;
            Object value6 = tVar3.getValue();
            value6.getClass();
            ((TextView) value6).setVisibility(0);
            Object value7 = tVar3.getValue();
            value7.getClass();
            TextView textView = (TextView) value7;
            int i14 = fVar.f133760a;
            textView.setText(i14 == 1 ? context.getString(R.string.lbl_single_person_i_follow_count, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) : context.getString(R.string.lbl_people_i_follow_count, String.valueOf(i14)));
            Object value8 = this.f37522d.getValue();
            value8.getClass();
            ((TextView) value8).setVisibility(8);
            Object value9 = this.f37524f.getValue();
            value9.getClass();
            ((TextView) value9).setVisibility(8);
            Object value10 = this.f37525g.getValue();
            value10.getClass();
            ((ImageView) value10).setVisibility(8);
        }
    }

    public static final /* synthetic */ class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37527a;

        static {
            int[] iArr = new int[ot0.i.values().length];
            try {
                iArr[ot0.i.VIEW_TYPE_BADGE_CHALLENGES_SECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ot0.i.VIEW_TYPE_ADVENTURES_SECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ot0.i.VIEW_TYPE_MY_CHALLENGE_SECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ot0.i.VIEW_TYPE_WEEKLY_LEADERBOARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ot0.i.VIEW_TYPE_FOOTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ot0.i.VIEW_TYPE_PROMOTION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f37527a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(String str, k kVar) {
        super(new l());
        str.getClass();
        kVar.getClass();
        this.f37466b = str;
        this.f37467c = kVar;
        this.f37468d = o13.m.b(new mh1.q(14));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return r(i14).getF133762c().f133772a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        i iVar = (i) f0Var;
        iVar.getClass();
        ot0.h hVarR = r(i14);
        hVarR.getClass();
        iVar.d(hVarR);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        Object next;
        viewGroup.getClass();
        ot0.i.f133763b.getClass();
        Iterator<T> it = ot0.i.f133771j.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((ot0.i) next).f133772a != i14);
        ot0.i iVar = (ot0.i) next;
        if (iVar == null) {
            iVar = ot0.i.VIEW_TYPE_MY_CHALLENGE_SECTION;
        }
        switch (r.f37527a[iVar.ordinal()]) {
            case 1:
                h hVar = this.f37469e;
                if (hVar != null) {
                    return hVar;
                }
                h hVar2 = new h(this, n23.j.b(viewGroup, R.layout.leaderboard_available_badge_challenges, viewGroup, false));
                hVar2.e(this.f37471g);
                this.f37469e = hVar2;
                return hVar2;
            case 2:
                return new d(this, n23.j.b(viewGroup, R.layout.leaderboard_available_adventures, viewGroup, false));
            case 3:
                o oVar = this.f37470f;
                if (oVar != null) {
                    return oVar;
                }
                o oVar2 = new o(this, n23.j.b(viewGroup, R.layout.leaderboard_my_challenges, viewGroup, false));
                oVar2.e(this.f37471g);
                this.f37470f = oVar2;
                return oVar2;
            case 4:
                return new q(this, n23.j.b(viewGroup, R.layout.leaderboard_challenges_list_item, viewGroup, false));
            case 5:
                return new j(this, n23.j.b(viewGroup, R.layout.leaderboard_challenges_list_footer, viewGroup, false));
            case 6:
                return new p(this, n23.j.b(viewGroup, R.layout.leaderboard_promotion, viewGroup, false));
            default:
                lc.u0.r();
                return null;
        }
    }
}
