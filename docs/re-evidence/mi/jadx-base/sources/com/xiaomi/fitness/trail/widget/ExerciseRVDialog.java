package com.xiaomi.fitness.trail.widget;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.baseui.dialog.DialogParams;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.trail.RecordMainActivityKt;
import defpackage.ah8;
import defpackage.bsi;
import defpackage.t7h;
import defpackage.tg8;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class ExerciseRVDialog extends CommonDialog<DialogParams> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f13250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public tg8 f13251b;
    public int c = -1;
    public int d;

    public static class a extends com.xiaomi.fitness.baseui.dialog.a<a, DialogParams, ExerciseRVDialog> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13252a;

        public a(DialogParams dialogParams) {
            super(dialogParams);
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a getThis() {
            return this;
        }

        @Override // com.xiaomi.fitness.baseui.dialog.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ExerciseRVDialog internalCreate() {
            ExerciseRVDialog exerciseRVDialog = new ExerciseRVDialog();
            Bundle bundle = new Bundle();
            bundle.putInt(RecordMainActivityKt.KEY_SPORT_TYPE, this.f13252a);
            exerciseRVDialog.setArguments(bundle);
            return exerciseRVDialog;
        }

        public a(String str) {
            this(new DialogParams(str));
        }
    }

    public interface b {
        void a(int i);
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void initCustomView(View view) {
        super.initCustomView(view);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(bsi.y5);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        tg8 tg8Var = this.f13251b;
        if (tg8Var != null) {
            tg8Var.i(new t7h() { // from class: jg8
                @Override // defpackage.t7h
                public final void a(Object obj) {
                    this.f22764a.z((Integer) obj);
                }
            });
            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(this.f13251b);
        }
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.d = arguments.getInt(RecordMainActivityKt.KEY_SPORT_TYPE, -1);
        }
        Context context = getContext();
        if (context == null) {
            return;
        }
        this.f13251b = new ah8(context, ah8.k(context));
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog
    public void onDialogDismiss(int i) {
        super.onDialogDismiss(i);
        if (this.c != -1) {
            Bundle bundle = new Bundle();
            bundle.putInt("select_index", this.c);
            bundle.putInt(RecordMainActivityKt.KEY_SPORT_TYPE, this.d);
            setResultData(Integer.valueOf(i), bundle);
        }
        this.c = -1;
    }

    @Override // com.xiaomi.fitness.baseui.dialog.CommonDialog, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        tg8 tg8Var;
        super.onStart();
        if (this.d == -1 || (tg8Var = this.f13251b) == null) {
            onDialogDismiss(-2);
        } else {
            tg8Var.notifyDataSetChanged();
        }
    }

    public void setOnSelectListener(b bVar) {
        this.f13250a = bVar;
    }

    public final /* synthetic */ void z(Integer num) {
        Logger.i("intensity choose by user " + num, new Object[0]);
        int iIntValue = num.intValue();
        this.c = iIntValue;
        b bVar = this.f13250a;
        if (bVar != null) {
            bVar.a(iIntValue);
        }
    }
}
