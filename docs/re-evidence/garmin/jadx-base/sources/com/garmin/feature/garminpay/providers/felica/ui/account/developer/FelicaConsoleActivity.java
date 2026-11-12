package com.garmin.feature.garminpay.providers.felica.ui.account.developer;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import b.g;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.felica.ui.account.developer.FelicaConsoleActivity;
import d53.w;
import e23.l;
import java.util.ArrayList;
import o13.h;
import o13.m;
import o13.t;
import o13.u;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import wn2.i;
import wn2.o;
import wn2.p;
import wn2.q;
import wn2.r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\bJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\bJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\bJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\bJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/FelicaConsoleActivity;", "Lhn2/c;", "<init>", "()V", "Landroid/view/View;", "view", "", "onClearMessageClicked", "(Landroid/view/View;)V", "onSetUserInfoClicked", "onFelicaGetCardListClicked", "onFelicaInitializeClicked", "onFelicaProvisionClicked", "onFelicaTopUpClicked", "onFelicaDeleteClicked", "onFelicaPermanentDeleteClicked", "onFelicaRecoverClicked", "onFelicaUpdateCardInfoClicked", "onFelicaGetCardUsageHistoryClicked", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FelicaConsoleActivity extends hn2.c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f51010q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Logger f51011r;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f51012g = new w1(s0.f105811a.b(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.class), new d(this), new c(this), new e(null, this));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f51013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f51014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f51015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f51016k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f51017l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f51018m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f51019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final t f51020o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wn2.c f51021p;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51022a;

        public b(l lVar) {
            lVar.getClass();
            this.f51022a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f51022a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51022a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f51023a;

        public c(g gVar) {
            this.f51023a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f51023a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f51024a;

        public d(g gVar) {
            this.f51024a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f51024a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f51025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f51026b;

        public e(e23.a aVar, g gVar) {
            this.f51025a = aVar;
            this.f51026b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f51025a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f51026b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f51011r = gt2.b.f79005a.h("FelicaConsoleActivity");
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [wn2.c] */
    public FelicaConsoleActivity() {
        final int i14 = 6;
        this.f51013h = m.b(new e23.a(this) { // from class: wn2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186352b;

            {
                this.f186352b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i15 = i14;
                FelicaConsoleActivity felicaConsoleActivity = this.f186352b;
                switch (i15) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_sequence_number);
                    case 1:
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_result_code);
                    case 2:
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_occurrence);
                    case 3:
                        FelicaConsoleActivity.a aVar4 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_end_api);
                    case 4:
                        FelicaConsoleActivity.a aVar5 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.end_api_result_code);
                    case 5:
                        FelicaConsoleActivity.a aVar6 = FelicaConsoleActivity.f51010q;
                        ArrayList arrayList = new ArrayList();
                        Object value = felicaConsoleActivity.f51015j.getValue();
                        value.getClass();
                        if (((CheckBox) value).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1052b(Integer.parseInt(felicaConsoleActivity.ga().getEditableText().toString()), felicaConsoleActivity.fa().getEditableText().toString(), Integer.parseInt(felicaConsoleActivity.ea().getEditableText().toString())));
                        }
                        Object value2 = felicaConsoleActivity.f51019n.getValue();
                        value2.getClass();
                        if (((CheckBox) value2).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1051a(felicaConsoleActivity.da().getEditableText().toString()));
                        }
                        if (felicaConsoleActivity.ha().isChecked()) {
                            arrayList.add(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.c.f51094a);
                        }
                        return arrayList;
                    case 6:
                        FelicaConsoleActivity.a aVar7 = FelicaConsoleActivity.f51010q;
                        return (TextView) felicaConsoleActivity.findViewById(R.id.message);
                    case 7:
                        FelicaConsoleActivity.a aVar8 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_none);
                    default:
                        FelicaConsoleActivity.a aVar9 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_get_script);
                }
            }
        });
        final int i15 = 7;
        this.f51014i = m.b(new e23.a(this) { // from class: wn2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186352b;

            {
                this.f186352b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i16 = i15;
                FelicaConsoleActivity felicaConsoleActivity = this.f186352b;
                switch (i16) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_sequence_number);
                    case 1:
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_result_code);
                    case 2:
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_occurrence);
                    case 3:
                        FelicaConsoleActivity.a aVar4 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_end_api);
                    case 4:
                        FelicaConsoleActivity.a aVar5 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.end_api_result_code);
                    case 5:
                        FelicaConsoleActivity.a aVar6 = FelicaConsoleActivity.f51010q;
                        ArrayList arrayList = new ArrayList();
                        Object value = felicaConsoleActivity.f51015j.getValue();
                        value.getClass();
                        if (((CheckBox) value).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1052b(Integer.parseInt(felicaConsoleActivity.ga().getEditableText().toString()), felicaConsoleActivity.fa().getEditableText().toString(), Integer.parseInt(felicaConsoleActivity.ea().getEditableText().toString())));
                        }
                        Object value2 = felicaConsoleActivity.f51019n.getValue();
                        value2.getClass();
                        if (((CheckBox) value2).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1051a(felicaConsoleActivity.da().getEditableText().toString()));
                        }
                        if (felicaConsoleActivity.ha().isChecked()) {
                            arrayList.add(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.c.f51094a);
                        }
                        return arrayList;
                    case 6:
                        FelicaConsoleActivity.a aVar7 = FelicaConsoleActivity.f51010q;
                        return (TextView) felicaConsoleActivity.findViewById(R.id.message);
                    case 7:
                        FelicaConsoleActivity.a aVar8 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_none);
                    default:
                        FelicaConsoleActivity.a aVar9 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_get_script);
                }
            }
        });
        final int i16 = 8;
        this.f51015j = m.b(new e23.a(this) { // from class: wn2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186352b;

            {
                this.f186352b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i17 = i16;
                FelicaConsoleActivity felicaConsoleActivity = this.f186352b;
                switch (i17) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_sequence_number);
                    case 1:
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_result_code);
                    case 2:
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_occurrence);
                    case 3:
                        FelicaConsoleActivity.a aVar4 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_end_api);
                    case 4:
                        FelicaConsoleActivity.a aVar5 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.end_api_result_code);
                    case 5:
                        FelicaConsoleActivity.a aVar6 = FelicaConsoleActivity.f51010q;
                        ArrayList arrayList = new ArrayList();
                        Object value = felicaConsoleActivity.f51015j.getValue();
                        value.getClass();
                        if (((CheckBox) value).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1052b(Integer.parseInt(felicaConsoleActivity.ga().getEditableText().toString()), felicaConsoleActivity.fa().getEditableText().toString(), Integer.parseInt(felicaConsoleActivity.ea().getEditableText().toString())));
                        }
                        Object value2 = felicaConsoleActivity.f51019n.getValue();
                        value2.getClass();
                        if (((CheckBox) value2).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1051a(felicaConsoleActivity.da().getEditableText().toString()));
                        }
                        if (felicaConsoleActivity.ha().isChecked()) {
                            arrayList.add(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.c.f51094a);
                        }
                        return arrayList;
                    case 6:
                        FelicaConsoleActivity.a aVar7 = FelicaConsoleActivity.f51010q;
                        return (TextView) felicaConsoleActivity.findViewById(R.id.message);
                    case 7:
                        FelicaConsoleActivity.a aVar8 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_none);
                    default:
                        FelicaConsoleActivity.a aVar9 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_get_script);
                }
            }
        });
        final int i17 = 0;
        this.f51016k = m.b(new e23.a(this) { // from class: wn2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186352b;

            {
                this.f186352b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i18 = i17;
                FelicaConsoleActivity felicaConsoleActivity = this.f186352b;
                switch (i18) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_sequence_number);
                    case 1:
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_result_code);
                    case 2:
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_occurrence);
                    case 3:
                        FelicaConsoleActivity.a aVar4 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_end_api);
                    case 4:
                        FelicaConsoleActivity.a aVar5 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.end_api_result_code);
                    case 5:
                        FelicaConsoleActivity.a aVar6 = FelicaConsoleActivity.f51010q;
                        ArrayList arrayList = new ArrayList();
                        Object value = felicaConsoleActivity.f51015j.getValue();
                        value.getClass();
                        if (((CheckBox) value).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1052b(Integer.parseInt(felicaConsoleActivity.ga().getEditableText().toString()), felicaConsoleActivity.fa().getEditableText().toString(), Integer.parseInt(felicaConsoleActivity.ea().getEditableText().toString())));
                        }
                        Object value2 = felicaConsoleActivity.f51019n.getValue();
                        value2.getClass();
                        if (((CheckBox) value2).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1051a(felicaConsoleActivity.da().getEditableText().toString()));
                        }
                        if (felicaConsoleActivity.ha().isChecked()) {
                            arrayList.add(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.c.f51094a);
                        }
                        return arrayList;
                    case 6:
                        FelicaConsoleActivity.a aVar7 = FelicaConsoleActivity.f51010q;
                        return (TextView) felicaConsoleActivity.findViewById(R.id.message);
                    case 7:
                        FelicaConsoleActivity.a aVar8 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_none);
                    default:
                        FelicaConsoleActivity.a aVar9 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_get_script);
                }
            }
        });
        final int i18 = 1;
        this.f51017l = m.b(new e23.a(this) { // from class: wn2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186352b;

            {
                this.f186352b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i19 = i18;
                FelicaConsoleActivity felicaConsoleActivity = this.f186352b;
                switch (i19) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_sequence_number);
                    case 1:
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_result_code);
                    case 2:
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_occurrence);
                    case 3:
                        FelicaConsoleActivity.a aVar4 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_end_api);
                    case 4:
                        FelicaConsoleActivity.a aVar5 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.end_api_result_code);
                    case 5:
                        FelicaConsoleActivity.a aVar6 = FelicaConsoleActivity.f51010q;
                        ArrayList arrayList = new ArrayList();
                        Object value = felicaConsoleActivity.f51015j.getValue();
                        value.getClass();
                        if (((CheckBox) value).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1052b(Integer.parseInt(felicaConsoleActivity.ga().getEditableText().toString()), felicaConsoleActivity.fa().getEditableText().toString(), Integer.parseInt(felicaConsoleActivity.ea().getEditableText().toString())));
                        }
                        Object value2 = felicaConsoleActivity.f51019n.getValue();
                        value2.getClass();
                        if (((CheckBox) value2).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1051a(felicaConsoleActivity.da().getEditableText().toString()));
                        }
                        if (felicaConsoleActivity.ha().isChecked()) {
                            arrayList.add(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.c.f51094a);
                        }
                        return arrayList;
                    case 6:
                        FelicaConsoleActivity.a aVar7 = FelicaConsoleActivity.f51010q;
                        return (TextView) felicaConsoleActivity.findViewById(R.id.message);
                    case 7:
                        FelicaConsoleActivity.a aVar8 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_none);
                    default:
                        FelicaConsoleActivity.a aVar9 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_get_script);
                }
            }
        });
        final int i19 = 2;
        this.f51018m = m.b(new e23.a(this) { // from class: wn2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186352b;

            {
                this.f186352b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i19;
                FelicaConsoleActivity felicaConsoleActivity = this.f186352b;
                switch (i110) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_sequence_number);
                    case 1:
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_result_code);
                    case 2:
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_occurrence);
                    case 3:
                        FelicaConsoleActivity.a aVar4 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_end_api);
                    case 4:
                        FelicaConsoleActivity.a aVar5 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.end_api_result_code);
                    case 5:
                        FelicaConsoleActivity.a aVar6 = FelicaConsoleActivity.f51010q;
                        ArrayList arrayList = new ArrayList();
                        Object value = felicaConsoleActivity.f51015j.getValue();
                        value.getClass();
                        if (((CheckBox) value).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1052b(Integer.parseInt(felicaConsoleActivity.ga().getEditableText().toString()), felicaConsoleActivity.fa().getEditableText().toString(), Integer.parseInt(felicaConsoleActivity.ea().getEditableText().toString())));
                        }
                        Object value2 = felicaConsoleActivity.f51019n.getValue();
                        value2.getClass();
                        if (((CheckBox) value2).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1051a(felicaConsoleActivity.da().getEditableText().toString()));
                        }
                        if (felicaConsoleActivity.ha().isChecked()) {
                            arrayList.add(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.c.f51094a);
                        }
                        return arrayList;
                    case 6:
                        FelicaConsoleActivity.a aVar7 = FelicaConsoleActivity.f51010q;
                        return (TextView) felicaConsoleActivity.findViewById(R.id.message);
                    case 7:
                        FelicaConsoleActivity.a aVar8 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_none);
                    default:
                        FelicaConsoleActivity.a aVar9 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_get_script);
                }
            }
        });
        final int i24 = 3;
        this.f51019n = m.b(new e23.a(this) { // from class: wn2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186352b;

            {
                this.f186352b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i24;
                FelicaConsoleActivity felicaConsoleActivity = this.f186352b;
                switch (i110) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_sequence_number);
                    case 1:
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_result_code);
                    case 2:
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_occurrence);
                    case 3:
                        FelicaConsoleActivity.a aVar4 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_end_api);
                    case 4:
                        FelicaConsoleActivity.a aVar5 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.end_api_result_code);
                    case 5:
                        FelicaConsoleActivity.a aVar6 = FelicaConsoleActivity.f51010q;
                        ArrayList arrayList = new ArrayList();
                        Object value = felicaConsoleActivity.f51015j.getValue();
                        value.getClass();
                        if (((CheckBox) value).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1052b(Integer.parseInt(felicaConsoleActivity.ga().getEditableText().toString()), felicaConsoleActivity.fa().getEditableText().toString(), Integer.parseInt(felicaConsoleActivity.ea().getEditableText().toString())));
                        }
                        Object value2 = felicaConsoleActivity.f51019n.getValue();
                        value2.getClass();
                        if (((CheckBox) value2).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1051a(felicaConsoleActivity.da().getEditableText().toString()));
                        }
                        if (felicaConsoleActivity.ha().isChecked()) {
                            arrayList.add(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.c.f51094a);
                        }
                        return arrayList;
                    case 6:
                        FelicaConsoleActivity.a aVar7 = FelicaConsoleActivity.f51010q;
                        return (TextView) felicaConsoleActivity.findViewById(R.id.message);
                    case 7:
                        FelicaConsoleActivity.a aVar8 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_none);
                    default:
                        FelicaConsoleActivity.a aVar9 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_get_script);
                }
            }
        });
        final int i25 = 4;
        this.f51020o = m.b(new e23.a(this) { // from class: wn2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186352b;

            {
                this.f186352b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i25;
                FelicaConsoleActivity felicaConsoleActivity = this.f186352b;
                switch (i110) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_sequence_number);
                    case 1:
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_result_code);
                    case 2:
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_occurrence);
                    case 3:
                        FelicaConsoleActivity.a aVar4 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_end_api);
                    case 4:
                        FelicaConsoleActivity.a aVar5 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.end_api_result_code);
                    case 5:
                        FelicaConsoleActivity.a aVar6 = FelicaConsoleActivity.f51010q;
                        ArrayList arrayList = new ArrayList();
                        Object value = felicaConsoleActivity.f51015j.getValue();
                        value.getClass();
                        if (((CheckBox) value).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1052b(Integer.parseInt(felicaConsoleActivity.ga().getEditableText().toString()), felicaConsoleActivity.fa().getEditableText().toString(), Integer.parseInt(felicaConsoleActivity.ea().getEditableText().toString())));
                        }
                        Object value2 = felicaConsoleActivity.f51019n.getValue();
                        value2.getClass();
                        if (((CheckBox) value2).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1051a(felicaConsoleActivity.da().getEditableText().toString()));
                        }
                        if (felicaConsoleActivity.ha().isChecked()) {
                            arrayList.add(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.c.f51094a);
                        }
                        return arrayList;
                    case 6:
                        FelicaConsoleActivity.a aVar7 = FelicaConsoleActivity.f51010q;
                        return (TextView) felicaConsoleActivity.findViewById(R.id.message);
                    case 7:
                        FelicaConsoleActivity.a aVar8 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_none);
                    default:
                        FelicaConsoleActivity.a aVar9 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_get_script);
                }
            }
        });
        final int i26 = 5;
        this.f51021p = new e23.a(this) { // from class: wn2.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186352b;

            {
                this.f186352b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                int i110 = i26;
                FelicaConsoleActivity felicaConsoleActivity = this.f186352b;
                switch (i110) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_sequence_number);
                    case 1:
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_result_code);
                    case 2:
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.get_script_occurrence);
                    case 3:
                        FelicaConsoleActivity.a aVar4 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_end_api);
                    case 4:
                        FelicaConsoleActivity.a aVar5 = FelicaConsoleActivity.f51010q;
                        return (EditText) felicaConsoleActivity.findViewById(R.id.end_api_result_code);
                    case 5:
                        FelicaConsoleActivity.a aVar6 = FelicaConsoleActivity.f51010q;
                        ArrayList arrayList = new ArrayList();
                        Object value = felicaConsoleActivity.f51015j.getValue();
                        value.getClass();
                        if (((CheckBox) value).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1052b(Integer.parseInt(felicaConsoleActivity.ga().getEditableText().toString()), felicaConsoleActivity.fa().getEditableText().toString(), Integer.parseInt(felicaConsoleActivity.ea().getEditableText().toString())));
                        }
                        Object value2 = felicaConsoleActivity.f51019n.getValue();
                        value2.getClass();
                        if (((CheckBox) value2).isChecked()) {
                            arrayList.add(new com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.C1051a(felicaConsoleActivity.da().getEditableText().toString()));
                        }
                        if (felicaConsoleActivity.ha().isChecked()) {
                            arrayList.add(com.garmin.feature.garminpay.providers.felica.ui.account.developer.a.b.c.f51094a);
                        }
                        return arrayList;
                    case 6:
                        FelicaConsoleActivity.a aVar7 = FelicaConsoleActivity.f51010q;
                        return (TextView) felicaConsoleActivity.findViewById(R.id.message);
                    case 7:
                        FelicaConsoleActivity.a aVar8 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_none);
                    default:
                        FelicaConsoleActivity.a aVar9 = FelicaConsoleActivity.f51010q;
                        return (CheckBox) felicaConsoleActivity.findViewById(R.id.mock_strategy_get_script);
                }
            }
        };
    }

    public final TextView ca() {
        Object value = this.f51013h.getValue();
        value.getClass();
        return (TextView) value;
    }

    public final EditText da() {
        Object value = this.f51020o.getValue();
        value.getClass();
        return (EditText) value;
    }

    public final EditText ea() {
        Object value = this.f51018m.getValue();
        value.getClass();
        return (EditText) value;
    }

    public final EditText fa() {
        Object value = this.f51017l.getValue();
        value.getClass();
        return (EditText) value;
    }

    public final EditText ga() {
        Object value = this.f51016k.getValue();
        value.getClass();
        return (EditText) value;
    }

    public final CheckBox ha() {
        Object value = this.f51014i.getValue();
        value.getClass();
        return (CheckBox) value;
    }

    public final com.garmin.feature.garminpay.providers.felica.ui.account.developer.a ia() {
        return (com.garmin.feature.garminpay.providers.felica.ui.account.developer.a) this.f51012g.getValue();
    }

    public final void onClearMessageClicked(View view2) {
        view2.getClass();
        ca().setText((CharSequence) null);
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    @SuppressLint({"SetTextI18n"})
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.activity_felica_console, hn2.c.a.BACK, "Felica Console");
        try {
            com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVarIa = ia();
            Intent intent = getIntent();
            intent.getClass();
            aVarIa.A4(intent, this.f51021p);
        } catch (Exception e4) {
            f51011r.error("Error entering Felica Console for this device.", (Throwable) e4);
            Toast.makeText(this, "Note: This only works for connected device. Also, please wait a few seconds after connection status turns green before entering.", 0).show();
            finish();
        }
        final int i14 = 0;
        ia().f51041o.f(this, new b(new l(this) { // from class: wn2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186350b;

            {
                this.f186350b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                FelicaConsoleActivity felicaConsoleActivity = this.f186350b;
                switch (i15) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        ((TextView) felicaConsoleActivity.findViewById(R.id.phone_number)).setText((String) obj);
                        break;
                    case 1:
                        o13.p pVar = (o13.p) obj;
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        if (((Boolean) pVar.f128594a).booleanValue()) {
                            hn2.c.ba(felicaConsoleActivity, Boolean.TRUE, (String) pVar.f128595b, null, 12);
                        } else {
                            hn2.c.ba(felicaConsoleActivity, Boolean.FALSE, null, null, 14);
                        }
                        break;
                    case 2:
                        String str = (String) obj;
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        if (str == null) {
                            felicaConsoleActivity.ca().setText((CharSequence) null);
                        } else {
                            TextView textViewCa = felicaConsoleActivity.ca();
                            textViewCa.append(str);
                            textViewCa.append("\n");
                        }
                        break;
                    default:
                        u uVar = (u) obj;
                        FelicaConsoleActivity.a aVar4 = FelicaConsoleActivity.f51010q;
                        long jLongValue = ((Number) uVar.f128605a).longValue();
                        String str2 = (String) uVar.f128606b;
                        rn2.i iVar = (rn2.i) uVar.f128607c;
                        TextView textView = (TextView) felicaConsoleActivity.findViewById(R.id.device_unit_id);
                        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(jLongValue, "Device: ", str2, "\nESN: ");
                        sbJ.append("\nCid: ");
                        sbJ.append(iVar);
                        textView.setText(sbJ.toString());
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i15 = 1;
        ia().f51042p.f(this, new b(new l(this) { // from class: wn2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186350b;

            {
                this.f186350b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                FelicaConsoleActivity felicaConsoleActivity = this.f186350b;
                switch (i16) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        ((TextView) felicaConsoleActivity.findViewById(R.id.phone_number)).setText((String) obj);
                        break;
                    case 1:
                        o13.p pVar = (o13.p) obj;
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        if (((Boolean) pVar.f128594a).booleanValue()) {
                            hn2.c.ba(felicaConsoleActivity, Boolean.TRUE, (String) pVar.f128595b, null, 12);
                        } else {
                            hn2.c.ba(felicaConsoleActivity, Boolean.FALSE, null, null, 14);
                        }
                        break;
                    case 2:
                        String str = (String) obj;
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        if (str == null) {
                            felicaConsoleActivity.ca().setText((CharSequence) null);
                        } else {
                            TextView textViewCa = felicaConsoleActivity.ca();
                            textViewCa.append(str);
                            textViewCa.append("\n");
                        }
                        break;
                    default:
                        u uVar = (u) obj;
                        FelicaConsoleActivity.a aVar4 = FelicaConsoleActivity.f51010q;
                        long jLongValue = ((Number) uVar.f128605a).longValue();
                        String str2 = (String) uVar.f128606b;
                        rn2.i iVar = (rn2.i) uVar.f128607c;
                        TextView textView = (TextView) felicaConsoleActivity.findViewById(R.id.device_unit_id);
                        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(jLongValue, "Device: ", str2, "\nESN: ");
                        sbJ.append("\nCid: ");
                        sbJ.append(iVar);
                        textView.setText(sbJ.toString());
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i16 = 2;
        ia().f51044r.f(this, new b(new l(this) { // from class: wn2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186350b;

            {
                this.f186350b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                FelicaConsoleActivity felicaConsoleActivity = this.f186350b;
                switch (i17) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        ((TextView) felicaConsoleActivity.findViewById(R.id.phone_number)).setText((String) obj);
                        break;
                    case 1:
                        o13.p pVar = (o13.p) obj;
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        if (((Boolean) pVar.f128594a).booleanValue()) {
                            hn2.c.ba(felicaConsoleActivity, Boolean.TRUE, (String) pVar.f128595b, null, 12);
                        } else {
                            hn2.c.ba(felicaConsoleActivity, Boolean.FALSE, null, null, 14);
                        }
                        break;
                    case 2:
                        String str = (String) obj;
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        if (str == null) {
                            felicaConsoleActivity.ca().setText((CharSequence) null);
                        } else {
                            TextView textViewCa = felicaConsoleActivity.ca();
                            textViewCa.append(str);
                            textViewCa.append("\n");
                        }
                        break;
                    default:
                        u uVar = (u) obj;
                        FelicaConsoleActivity.a aVar4 = FelicaConsoleActivity.f51010q;
                        long jLongValue = ((Number) uVar.f128605a).longValue();
                        String str2 = (String) uVar.f128606b;
                        rn2.i iVar = (rn2.i) uVar.f128607c;
                        TextView textView = (TextView) felicaConsoleActivity.findViewById(R.id.device_unit_id);
                        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(jLongValue, "Device: ", str2, "\nESN: ");
                        sbJ.append("\nCid: ");
                        sbJ.append(iVar);
                        textView.setText(sbJ.toString());
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i17 = 3;
        ia().f51043q.f(this, new b(new l(this) { // from class: wn2.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186350b;

            {
                this.f186350b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                FelicaConsoleActivity felicaConsoleActivity = this.f186350b;
                switch (i18) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        ((TextView) felicaConsoleActivity.findViewById(R.id.phone_number)).setText((String) obj);
                        break;
                    case 1:
                        o13.p pVar = (o13.p) obj;
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        if (((Boolean) pVar.f128594a).booleanValue()) {
                            hn2.c.ba(felicaConsoleActivity, Boolean.TRUE, (String) pVar.f128595b, null, 12);
                        } else {
                            hn2.c.ba(felicaConsoleActivity, Boolean.FALSE, null, null, 14);
                        }
                        break;
                    case 2:
                        String str = (String) obj;
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        if (str == null) {
                            felicaConsoleActivity.ca().setText((CharSequence) null);
                        } else {
                            TextView textViewCa = felicaConsoleActivity.ca();
                            textViewCa.append(str);
                            textViewCa.append("\n");
                        }
                        break;
                    default:
                        u uVar = (u) obj;
                        FelicaConsoleActivity.a aVar4 = FelicaConsoleActivity.f51010q;
                        long jLongValue = ((Number) uVar.f128605a).longValue();
                        String str2 = (String) uVar.f128606b;
                        rn2.i iVar = (rn2.i) uVar.f128607c;
                        TextView textView = (TextView) felicaConsoleActivity.findViewById(R.id.device_unit_id);
                        StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(jLongValue, "Device: ", str2, "\nESN: ");
                        sbJ.append("\nCid: ");
                        sbJ.append(iVar);
                        textView.setText(sbJ.toString());
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i18 = 0;
        ha().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: wn2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186354b;

            {
                this.f186354b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i19 = i18;
                FelicaConsoleActivity felicaConsoleActivity = this.f186354b;
                switch (i19) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        compoundButton.getClass();
                        if (z14) {
                            Object value = felicaConsoleActivity.f51015j.getValue();
                            value.getClass();
                            ((CheckBox) value).setChecked(false);
                            Object value2 = felicaConsoleActivity.f51019n.getValue();
                            value2.getClass();
                            ((CheckBox) value2).setChecked(false);
                        }
                        break;
                    case 1:
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        compoundButton.getClass();
                        if (!z14) {
                            felicaConsoleActivity.ga().setEnabled(false);
                            felicaConsoleActivity.fa().setEnabled(false);
                            felicaConsoleActivity.ea().setEnabled(false);
                            felicaConsoleActivity.ga().getText().clear();
                            felicaConsoleActivity.fa().getText().clear();
                            felicaConsoleActivity.ea().getText().clear();
                        } else {
                            felicaConsoleActivity.ha().setChecked(false);
                            felicaConsoleActivity.ga().setEnabled(true);
                            felicaConsoleActivity.fa().setEnabled(true);
                            felicaConsoleActivity.ea().setEnabled(true);
                        }
                        break;
                    default:
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        compoundButton.getClass();
                        if (!z14) {
                            felicaConsoleActivity.da().setEnabled(false);
                            felicaConsoleActivity.da().getText().clear();
                        } else {
                            felicaConsoleActivity.ha().setChecked(false);
                            felicaConsoleActivity.da().setEnabled(true);
                        }
                        break;
                }
            }
        });
        Object value = this.f51015j.getValue();
        value.getClass();
        final int i19 = 1;
        ((CheckBox) value).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: wn2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186354b;

            {
                this.f186354b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i110 = i19;
                FelicaConsoleActivity felicaConsoleActivity = this.f186354b;
                switch (i110) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        compoundButton.getClass();
                        if (z14) {
                            Object value2 = felicaConsoleActivity.f51015j.getValue();
                            value2.getClass();
                            ((CheckBox) value2).setChecked(false);
                            Object value3 = felicaConsoleActivity.f51019n.getValue();
                            value3.getClass();
                            ((CheckBox) value3).setChecked(false);
                        }
                        break;
                    case 1:
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        compoundButton.getClass();
                        if (!z14) {
                            felicaConsoleActivity.ga().setEnabled(false);
                            felicaConsoleActivity.fa().setEnabled(false);
                            felicaConsoleActivity.ea().setEnabled(false);
                            felicaConsoleActivity.ga().getText().clear();
                            felicaConsoleActivity.fa().getText().clear();
                            felicaConsoleActivity.ea().getText().clear();
                        } else {
                            felicaConsoleActivity.ha().setChecked(false);
                            felicaConsoleActivity.ga().setEnabled(true);
                            felicaConsoleActivity.fa().setEnabled(true);
                            felicaConsoleActivity.ea().setEnabled(true);
                        }
                        break;
                    default:
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        compoundButton.getClass();
                        if (!z14) {
                            felicaConsoleActivity.da().setEnabled(false);
                            felicaConsoleActivity.da().getText().clear();
                        } else {
                            felicaConsoleActivity.ha().setChecked(false);
                            felicaConsoleActivity.da().setEnabled(true);
                        }
                        break;
                }
            }
        });
        Object value2 = this.f51019n.getValue();
        value2.getClass();
        final int i24 = 2;
        ((CheckBox) value2).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: wn2.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FelicaConsoleActivity f186354b;

            {
                this.f186354b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z14) {
                int i110 = i24;
                FelicaConsoleActivity felicaConsoleActivity = this.f186354b;
                switch (i110) {
                    case 0:
                        FelicaConsoleActivity.a aVar = FelicaConsoleActivity.f51010q;
                        compoundButton.getClass();
                        if (z14) {
                            Object value3 = felicaConsoleActivity.f51015j.getValue();
                            value3.getClass();
                            ((CheckBox) value3).setChecked(false);
                            Object value4 = felicaConsoleActivity.f51019n.getValue();
                            value4.getClass();
                            ((CheckBox) value4).setChecked(false);
                        }
                        break;
                    case 1:
                        FelicaConsoleActivity.a aVar2 = FelicaConsoleActivity.f51010q;
                        compoundButton.getClass();
                        if (!z14) {
                            felicaConsoleActivity.ga().setEnabled(false);
                            felicaConsoleActivity.fa().setEnabled(false);
                            felicaConsoleActivity.ea().setEnabled(false);
                            felicaConsoleActivity.ga().getText().clear();
                            felicaConsoleActivity.fa().getText().clear();
                            felicaConsoleActivity.ea().getText().clear();
                        } else {
                            felicaConsoleActivity.ha().setChecked(false);
                            felicaConsoleActivity.ga().setEnabled(true);
                            felicaConsoleActivity.fa().setEnabled(true);
                            felicaConsoleActivity.ea().setEnabled(true);
                        }
                        break;
                    default:
                        FelicaConsoleActivity.a aVar3 = FelicaConsoleActivity.f51010q;
                        compoundButton.getClass();
                        if (!z14) {
                            felicaConsoleActivity.da().setEnabled(false);
                            felicaConsoleActivity.da().getText().clear();
                        } else {
                            felicaConsoleActivity.ha().setChecked(false);
                            felicaConsoleActivity.da().setEnabled(true);
                        }
                        break;
                }
            }
        });
    }

    public final void onFelicaDeleteClicked(View view2) {
        view2.getClass();
        com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVarIa = ia();
        gl.b.I(v1.a(aVarIa), null, new i(aVarIa, null), 3);
    }

    public final void onFelicaGetCardListClicked(View view2) {
        view2.getClass();
        com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVarIa = ia();
        gl.b.I(v1.a(aVarIa), null, new wn2.l(aVarIa, null), 3);
    }

    public final void onFelicaGetCardUsageHistoryClicked(View view2) {
        view2.getClass();
        com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVarIa = ia();
        gl.b.I(v1.a(aVarIa), null, new wn2.m(aVarIa, null), 3);
    }

    public final void onFelicaInitializeClicked(View view2) {
        view2.getClass();
        String string = ((EditText) findViewById(R.id.device_manufacturer)).getText().toString();
        String str = !w.J(string) ? string : null;
        String string2 = ((EditText) findViewById(R.id.modified_device_name)).getText().toString();
        String str2 = !w.J(string2) ? string2 : null;
        String string3 = ((EditText) findViewById(R.id.device_identification_data)).getText().toString();
        String str3 = !w.J(string3) ? string3 : null;
        com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVarIa = ia();
        gl.b.I(v1.a(aVarIa), null, new wn2.n(aVarIa, str, str2, str3, null), 3);
    }

    public final void onFelicaPermanentDeleteClicked(View view2) {
        view2.getClass();
        com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVarIa = ia();
        gl.b.I(v1.a(aVarIa), null, new o(aVarIa, null), 3);
    }

    public final void onFelicaProvisionClicked(View view2) {
        view2.getClass();
        com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVarIa = ia();
        gl.b.I(v1.a(aVarIa), null, new p(aVarIa, null), 3);
    }

    public final void onFelicaRecoverClicked(View view2) {
        view2.getClass();
        com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVarIa = ia();
        gl.b.I(v1.a(aVarIa), null, new q(aVarIa, null), 3);
    }

    public final void onFelicaTopUpClicked(View view2) {
        view2.getClass();
        com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVarIa = ia();
        gl.b.I(v1.a(aVarIa), null, new r(aVarIa, null), 3);
    }

    public final void onFelicaUpdateCardInfoClicked(View view2) {
        view2.getClass();
        com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVarIa = ia();
        gl.b.I(v1.a(aVarIa), null, new wn2.s(aVarIa, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public final void onSetUserInfoClicked(View view2) {
        view2.getClass();
        String string = ((EditText) findViewById(R.id.phone_number_input)).getText().toString();
        String string2 = ((EditText) findViewById(R.id.first_name_input)).getText().toString();
        if (w.J(string2)) {
            string2 = null;
        }
        String string3 = ((EditText) findViewById(R.id.last_name_input)).getText().toString();
        String str = w.J(string3) ? null : string3;
        try {
            if (string.length() != 11) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            ia().f51031e.m(string);
            if (string2 == null || str == null) {
                return;
            }
            com.garmin.feature.garminpay.providers.felica.ui.account.developer.a aVarIa = ia();
            aVarIa.f51032f = string2;
            aVarIa.f51033g = str;
        } catch (Exception unused) {
            ca().append("Requires 11 digits for phone number");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/ui/account/developer/FelicaConsoleActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "EXTRA_UNIT_ID", "EXTRA_UNIT_DEVICE_NAME", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
