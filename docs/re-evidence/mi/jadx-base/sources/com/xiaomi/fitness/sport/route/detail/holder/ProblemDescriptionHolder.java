package com.xiaomi.fitness.sport.route.detail.holder;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import defpackage.aki;
import defpackage.c1j;
import defpackage.eoi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/route/detail/holder/ProblemDescriptionHolder;", "", "context", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "problemDesEt", "Landroid/widget/EditText;", "wordCountTv", "Landroid/widget/TextView;", "submitBtn", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Landroid/widget/EditText;Landroid/widget/TextView;Landroid/widget/TextView;)V", "getContext", "()Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "initHolder", "", "getProblemDes", "", "problemDesIsValid", "", "Companion", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProblemDescriptionHolder {

    @NotNull
    public static final String TAG = "ProblemDescriptionHolder";

    @NotNull
    private final BaseActivity context;

    @NotNull
    private final EditText problemDesEt;

    @NotNull
    private final TextView submitBtn;

    @NotNull
    private final TextView wordCountTv;

    public ProblemDescriptionHolder(@NotNull BaseActivity context, @NotNull EditText problemDesEt, @NotNull TextView wordCountTv, @NotNull TextView submitBtn) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(problemDesEt, "problemDesEt");
        Intrinsics.checkNotNullParameter(wordCountTv, "wordCountTv");
        Intrinsics.checkNotNullParameter(submitBtn, "submitBtn");
        this.context = context;
        this.problemDesEt = problemDesEt;
        this.wordCountTv = wordCountTv;
        this.submitBtn = submitBtn;
    }

    @NotNull
    public final BaseActivity getContext() {
        return this.context;
    }

    @NotNull
    public final String getProblemDes() {
        return StringsKt__StringsKt.trim((CharSequence) this.problemDesEt.getText().toString()).toString();
    }

    public final void initHolder() {
        this.problemDesEt.setFilters(new InputFilter[]{new InputFilter.LengthFilter(500)});
        this.wordCountTv.setText(this.context.getString(c1j.Z0, 0));
        this.problemDesEt.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.sport.route.detail.holder.ProblemDescriptionHolder.initHolder.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                int length = s != null ? s.length() : 0;
                ProblemDescriptionHolder.this.wordCountTv.setText(ProblemDescriptionHolder.this.getContext().getString(c1j.Z0, Integer.valueOf(length)));
                boolean z = length != 0;
                ProblemDescriptionHolder.this.submitBtn.setEnabled(z);
                ProblemDescriptionHolder.this.submitBtn.setBackgroundResource(z ? eoi.f16883b : eoi.k0);
                ProblemDescriptionHolder.this.submitBtn.setTextColor(ProblemDescriptionHolder.this.getContext().getResources().getColor(z ? aki.G : aki.C, null));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
    }

    public final boolean problemDesIsValid() {
        if (getProblemDes().length() >= 30) {
            return true;
        }
        ToastExtKt.toastShort(ApplicationExtKt.getApplication(), c1j.L3);
        return false;
    }
}
