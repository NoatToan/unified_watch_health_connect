package com.xiaomi.fitness.detail.video.share.holder;

import android.graphics.BlendMode;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.detail.video.share.model.SportTracePointDataModel;
import com.xiaomi.fitness.detail.video.share.util.SportTraceVideoShareUtilKt;
import defpackage.dki;
import defpackage.nfj;
import defpackage.ofj;
import defpackage.srp;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBA\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u001a\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00110\u0010\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/detail/video/share/holder/RecordFeelingsHolder;", "", "", "refreshEditText", "()V", "initHolder", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "context", "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "getContext", "()Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "Lsrp;", "mBinding", "Lsrp;", "getMBinding", "()Lsrp;", "Landroidx/lifecycle/MutableLiveData;", "", "", "Lcom/xiaomi/fitness/detail/video/share/model/SportTracePointDataModel;", "traceDataMapLiveData", "Landroidx/lifecycle/MutableLiveData;", "curtProgressLiveData", "Landroid/widget/EditText;", "editText", "Landroid/widget/EditText;", "<init>", "(Lcom/xiaomi/fitness/baseui/view/BaseActivity;Lsrp;Landroidx/lifecycle/MutableLiveData;Landroidx/lifecycle/MutableLiveData;)V", "Companion", "sport-record_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class RecordFeelingsHolder {
    public static final int MAX_CHARACTER_LIMIT = 25;

    @NotNull
    public static final String TAG = "RecordFeelingsHolder";

    @NotNull
    private final BaseActivity context;

    @NotNull
    private final MutableLiveData<Float> curtProgressLiveData;

    @NotNull
    private final EditText editText;

    @NotNull
    private final srp mBinding;

    @NotNull
    private final MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData;

    public RecordFeelingsHolder(@NotNull BaseActivity context, @NotNull srp mBinding, @NotNull MutableLiveData<Map<Float, SportTracePointDataModel>> traceDataMapLiveData, @NotNull MutableLiveData<Float> curtProgressLiveData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mBinding, "mBinding");
        Intrinsics.checkNotNullParameter(traceDataMapLiveData, "traceDataMapLiveData");
        Intrinsics.checkNotNullParameter(curtProgressLiveData, "curtProgressLiveData");
        this.context = context;
        this.mBinding = mBinding;
        this.traceDataMapLiveData = traceDataMapLiveData;
        this.curtProgressLiveData = curtProgressLiveData;
        EditText editText = mBinding.A;
        Intrinsics.checkNotNullExpressionValue(editText, "editText");
        this.editText = editText;
    }

    @NotNull
    public final BaseActivity getContext() {
        return this.context;
    }

    @NotNull
    public final srp getMBinding() {
        return this.mBinding;
    }

    public final void initHolder() {
        int color = this.context.getResources().getColor(dki.c2, null);
        if (Build.VERSION.SDK_INT >= 29) {
            Drawable background = this.editText.getBackground();
            ofj.a();
            background.setColorFilter(nfj.a(color, BlendMode.SRC_ATOP));
        } else {
            this.editText.getBackground().setColorFilter(color, PorterDuff.Mode.SRC_ATOP);
        }
        this.mBinding.A.setFilters(new InputFilter[]{new InputFilter.LengthFilter(25)});
        this.mBinding.A.addTextChangedListener(new TextWatcher() { // from class: com.xiaomi.fitness.detail.video.share.holder.RecordFeelingsHolder.initHolder.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
                if (s != null && s.length() > 25) {
                    s.delete(25, s.length());
                }
                SportTraceVideoShareUtilKt.updateFeelingsText(RecordFeelingsHolder.this.traceDataMapLiveData, RecordFeelingsHolder.this.curtProgressLiveData, String.valueOf(s));
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            }
        });
    }

    public final void refreshEditText() {
        SportTracePointDataModel sportTracePointDataModel;
        Map<Float, SportTracePointDataModel> value = this.traceDataMapLiveData.getValue();
        Float value2 = this.curtProgressLiveData.getValue();
        Logger.d(SportTraceVideoShareUtilKt.SPORT_TRACE_TAG, "refreshEditText progressValue=" + value2);
        this.editText.setText((value == null || (sportTracePointDataModel = value.get(value2)) == null) ? null : sportTracePointDataModel.getFeelings());
    }
}
