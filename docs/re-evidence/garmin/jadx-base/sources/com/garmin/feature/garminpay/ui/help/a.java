package com.garmin.feature.garminpay.ui.help;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import d13.l;
import er2.d;
import er2.e;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\t\n\u000bB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/garmin/feature/garminpay/ui/help/a;", "Landroidx/recyclerview/widget/RecyclerView$h;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "b", "a", "c", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends RecyclerView.h<RecyclerView.f0> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<Integer> f52109e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f52110a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m13.a<b> f52112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f52113d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/help/a$c;", "Landroidx/recyclerview/widget/RecyclerView$f0;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends RecyclerView.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f52119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f52120b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(View view2) {
            super(view2);
            view2.getClass();
            View viewFindViewById = view2.findViewById(R.id.text_item_info);
            viewFindViewById.getClass();
            this.f52119a = (TextView) viewFindViewById;
            View viewFindViewById2 = view2.findViewById(R.id.text_item_value);
            viewFindViewById2.getClass();
            this.f52120b = (TextView) viewFindViewById2;
        }
    }

    static {
        new C1096a(null);
        f52109e = x.k(0, 1, 2, 3, 4, 5, 6, 4, 7, 8, 9, 10);
    }

    public a(Context context, String str) {
        context.getClass();
        str.getClass();
        this.f52110a = context;
        this.f52111b = str;
        m13.a<b> aVar = new m13.a<>();
        this.f52112c = aVar;
        this.f52113d = new l(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemCount() {
        return f52109e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final int getItemViewType(int i14) {
        return f52109e.get(i14).intValue();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final void onBindViewHolder(RecyclerView.f0 f0Var, int i14) {
        f0Var.getClass();
        int itemViewType = f0Var.getItemViewType();
        Context context = this.f52110a;
        if (itemViewType == 0) {
            e eVar = f0Var instanceof e ? (e) f0Var : null;
            if (eVar != null) {
                Button button = eVar.f65076a;
                button.setText(context.getString(R.string.wallet_garmin_pay_support));
                button.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.exterior_link, 0);
                button.setCompoundDrawableTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_secondary)));
                final int i15 = 0;
                button.setOnClickListener(new View.OnClickListener(this) { // from class: nr2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.help.a f127611b;

                    {
                        this.f127611b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i15) {
                            case 0:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.C1098b.f52115a);
                                break;
                            case 1:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.d.f52117a);
                                break;
                            case 2:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.e.f52118a);
                                break;
                            case 3:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.c.f52116a);
                                break;
                            default:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.C1097a.f52114a);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (itemViewType == 1) {
            e eVar2 = f0Var instanceof e ? (e) f0Var : null;
            if (eVar2 != null) {
                Button button2 = eVar2.f65076a;
                button2.setText(context.getString(R.string.wallet_is_card_supported));
                button2.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.exterior_link, 0);
                button2.setCompoundDrawableTintList(ColorStateList.valueOf(a7.b.getColor(context, R.color.gcm_icon_secondary)));
                final int i16 = 1;
                button2.setOnClickListener(new View.OnClickListener(this) { // from class: nr2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.help.a f127611b;

                    {
                        this.f127611b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i16) {
                            case 0:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.C1098b.f52115a);
                                break;
                            case 1:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.d.f52117a);
                                break;
                            case 2:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.e.f52118a);
                                break;
                            case 3:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.c.f52116a);
                                break;
                            default:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.C1097a.f52114a);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (itemViewType == 2) {
            e eVar3 = f0Var instanceof e ? (e) f0Var : null;
            if (eVar3 != null) {
                Button button3 = eVar3.f65076a;
                button3.setText(context.getString(R.string.wallet_watch_not_shown));
                final int i17 = 2;
                button3.setOnClickListener(new View.OnClickListener(this) { // from class: nr2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.help.a f127611b;

                    {
                        this.f127611b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i17) {
                            case 0:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.C1098b.f52115a);
                                break;
                            case 1:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.d.f52117a);
                                break;
                            case 2:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.e.f52118a);
                                break;
                            case 3:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.c.f52116a);
                                break;
                            default:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.C1097a.f52114a);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (itemViewType == 3) {
            e eVar4 = f0Var instanceof e ? (e) f0Var : null;
            if (eVar4 != null) {
                Button button4 = eVar4.f65076a;
                button4.setText(context.getString(R.string.wallet_how_to_update_watch));
                final int i18 = 3;
                button4.setOnClickListener(new View.OnClickListener(this) { // from class: nr2.a

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.garmin.feature.garminpay.ui.help.a f127611b;

                    {
                        this.f127611b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        switch (i18) {
                            case 0:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.C1098b.f52115a);
                                break;
                            case 1:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.d.f52117a);
                                break;
                            case 2:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.e.f52118a);
                                break;
                            case 3:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.c.f52116a);
                                break;
                            default:
                                this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.C1097a.f52114a);
                                break;
                        }
                    }
                });
                return;
            }
            return;
        }
        if (itemViewType != 5) {
            if (itemViewType != 6) {
                return;
            }
            c cVar = f0Var instanceof c ? (c) f0Var : null;
            if (cVar != null) {
                cVar.f52119a.setText(context.getString(R.string.label_app_version));
                cVar.f52120b.setText(this.f52111b);
                return;
            }
            return;
        }
        e eVar5 = f0Var instanceof e ? (e) f0Var : null;
        if (eVar5 != null) {
            Button button5 = eVar5.f65076a;
            button5.setText(context.getString(R.string.pref_app_diagnostics_title));
            final int i19 = 4;
            button5.setOnClickListener(new View.OnClickListener(this) { // from class: nr2.a

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.garmin.feature.garminpay.ui.help.a f127611b;

                {
                    this.f127611b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    switch (i19) {
                        case 0:
                            this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.C1098b.f52115a);
                            break;
                        case 1:
                            this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.d.f52117a);
                            break;
                        case 2:
                            this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.e.f52118a);
                            break;
                        case 3:
                            this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.c.f52116a);
                            break;
                        default:
                            this.f127611b.f52112c.c(com.garmin.feature.garminpay.ui.help.a.b.C1097a.f52114a);
                            break;
                    }
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public final RecyclerView.f0 onCreateViewHolder(ViewGroup viewGroup, int i14) {
        viewGroup.getClass();
        Context context = this.f52110a;
        switch (i14) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                View viewInflate = LayoutInflater.from(context).inflate(R.layout.item_button_section, viewGroup, false);
                viewInflate.getClass();
                return new e(viewInflate);
            case 4:
            default:
                View viewInflate2 = LayoutInflater.from(context).inflate(R.layout.item_border_section, viewGroup, false);
                viewInflate2.getClass();
                return new d(viewInflate2);
            case 6:
                View viewInflate3 = LayoutInflater.from(context).inflate(R.layout.item_info_value_section, viewGroup, false);
                viewInflate3.getClass();
                return new c(viewInflate3);
        }
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.help.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/garmin/feature/garminpay/ui/help/a$a;", "", "<init>", "()V", "", "TYPE_GARMIN_PAY_SUPPORT", "I", "TYPE_IS_MY_CARD_SUPPORTED", "TYPE_WATCH_NOT_SEEN", "TYPE_HOW_TO_UPDATE_WATCH", "TYPE_BORDER", "TYPE_APP_DIAGNOSTICS", "TYPE_APP_VERSION", "TYPE_EULA", "TYPE_SECURITY_POLICY", "TYPE_PRIVACY_POLICY", "TYPE_COPYRIGHT", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1096a {
        public /* synthetic */ C1096a(j jVar) {
            this();
        }

        private C1096a() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/garmin/feature/garminpay/ui/help/a$b;", "", "<init>", "()V", "b", "d", JWKParameterNames.RSA_EXPONENT, "c", "a", "Lcom/garmin/feature/garminpay/ui/help/a$b$a;", "Lcom/garmin/feature/garminpay/ui/help/a$b$b;", "Lcom/garmin/feature/garminpay/ui/help/a$b$c;", "Lcom/garmin/feature/garminpay/ui/help/a$b$d;", "Lcom/garmin/feature/garminpay/ui/help/a$b$e;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.help.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/help/a$b$a;", "Lcom/garmin/feature/garminpay/ui/help/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1097a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1097a f52114a = new C1097a();

            private C1097a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.ui.help.a$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/help/a$b$b;", "Lcom/garmin/feature/garminpay/ui/help/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1098b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1098b f52115a = new C1098b();

            private C1098b() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/help/a$b$c;", "Lcom/garmin/feature/garminpay/ui/help/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f52116a = new c();

            private c() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/help/a$b$d;", "Lcom/garmin/feature/garminpay/ui/help/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f52117a = new d();

            private d() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/ui/help/a$b$e;", "Lcom/garmin/feature/garminpay/ui/help/a$b;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f52118a = new e();

            private e() {
                super(null);
            }
        }

        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }
}
