package com.xiaomi.fitness.relative.base;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.baseui.view.BaseFragment;
import com.xiaomi.fitness.common.log.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 >2\u00020\u0001:\u0002>?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020.H\u0014J\u0010\u00104\u001a\u00020.2\u0006\u00105\u001a\u000202H\u0016J\u000e\u00106\u001a\u00020.2\u0006\u00107\u001a\u00020 J\u0010\u00108\u001a\u00020.2\u0006\u00109\u001a\u00020:H\u0016J\b\u0010=\u001a\u00020.H\u0002J\b\u0010\u0004\u001a\u00020\u0005H$R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u0014X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0016R\u001a\u0010'\u001a\u00020(X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0014\u0010;\u001a\u00020\u00148DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0016¨\u0006@"}, d2 = {"Lcom/xiaomi/fitness/relative/base/BaseRelativeChildFragment;", "Lcom/xiaomi/fitness/baseui/view/BaseFragment;", "<init>", "()V", "xAxisPosition", "", "getXAxisPosition", "()I", "setXAxisPosition", "(I)V", "mCurrentDate", "Lorg/joda/time/LocalDate;", "getMCurrentDate", "()Lorg/joda/time/LocalDate;", "setMCurrentDate", "(Lorg/joda/time/LocalDate;)V", "mSavedStateDate", "getMSavedStateDate", "setMSavedStateDate", "sid", "", "getSid", "()Ljava/lang/String;", "setSid", "(Ljava/lang/String;)V", "basicDataViewModel", "Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "getBasicDataViewModel", "()Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;", "setBasicDataViewModel", "(Lcom/xiaomi/fitness/relative/base/BasicRelativeDataViewModel;)V", "mSelectChangedListener", "Lcom/xiaomi/fitness/relative/base/BaseRelativeChildFragment$OnDateSelectChangedListener;", "getMSelectChangedListener", "()Lcom/xiaomi/fitness/relative/base/BaseRelativeChildFragment$OnDateSelectChangedListener;", "setMSelectChangedListener", "(Lcom/xiaomi/fitness/relative/base/BaseRelativeChildFragment$OnDateSelectChangedListener;)V", "logTag", "getLogTag", "relativeUid", "", "getRelativeUid", "()J", "setRelativeUid", "(J)V", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onVisible", "onSaveInstanceState", "outState", "setOnSelectChangedListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setMenuVisibility", "menuVisible", "", "requestTag", "getRequestTag", "refreshSelectDateIfNeed", "Companion", "OnDateSelectChangedListener", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseRelativeChildFragment extends BaseFragment {

    @NotNull
    public static final String KEY_SAVED_DATE = "saved_date";

    @Nullable
    private BasicRelativeDataViewModel basicDataViewModel;

    @NotNull
    private final String logTag;

    @Nullable
    private LocalDate mCurrentDate;

    @Nullable
    private LocalDate mSavedStateDate;

    @Nullable
    private OnDateSelectChangedListener mSelectChangedListener;
    private long relativeUid;

    @Nullable
    private String sid;
    private int xAxisPosition;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/relative/base/BaseRelativeChildFragment$OnDateSelectChangedListener;", "", "onSelectDateChanged", "", "selectDate", "Lorg/joda/time/LocalDate;", "onSelectStartEndDateChanged", "startDate", "endDate", "onTitleBarJumpEnable", "enable", "", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnDateSelectChangedListener {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class DefaultImpls {
            public static void onSelectStartEndDateChanged(@NotNull OnDateSelectChangedListener onDateSelectChangedListener, @NotNull LocalDate startDate, @NotNull LocalDate endDate) {
                Intrinsics.checkNotNullParameter(startDate, "startDate");
                Intrinsics.checkNotNullParameter(endDate, "endDate");
            }

            public static void onTitleBarJumpEnable(@NotNull OnDateSelectChangedListener onDateSelectChangedListener, boolean z) {
            }
        }

        void onSelectDateChanged(@Nullable LocalDate selectDate);

        void onSelectStartEndDateChanged(@NotNull LocalDate startDate, @NotNull LocalDate endDate);

        void onTitleBarJumpEnable(boolean enable);
    }

    public BaseRelativeChildFragment() {
        super(0, 1, null);
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.logTag = simpleName;
        this.relativeUid = -1L;
    }

    private final void refreshSelectDateIfNeed() {
        LocalDate localDate = this.mSavedStateDate;
        if (localDate != null) {
            this.mCurrentDate = localDate;
            this.mSavedStateDate = null;
        } else {
            Bundle arguments = getArguments();
            this.mCurrentDate = (LocalDate) (arguments != null ? arguments.getSerializable("local_date") : null);
        }
        Logger.d(this.logTag, "child refreshSelectDateIfNeed position:" + this.xAxisPosition + ";ChildFragment.. date:" + this.mCurrentDate);
        if (this.mCurrentDate == null) {
            this.mCurrentDate = LocalDate.now();
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            this.sid = arguments2.getString("did");
            this.relativeUid = arguments2.getLong("key_relative_uid");
        }
    }

    @Nullable
    public final BasicRelativeDataViewModel getBasicDataViewModel() {
        return this.basicDataViewModel;
    }

    @NotNull
    public final String getLogTag() {
        return this.logTag;
    }

    @Nullable
    public final LocalDate getMCurrentDate() {
        return this.mCurrentDate;
    }

    @Nullable
    public final LocalDate getMSavedStateDate() {
        return this.mSavedStateDate;
    }

    @Nullable
    public final OnDateSelectChangedListener getMSelectChangedListener() {
        return this.mSelectChangedListener;
    }

    public final long getRelativeUid() {
        return this.relativeUid;
    }

    @NotNull
    public final String getRequestTag() {
        int i = this.xAxisPosition;
        if (i != 0) {
            return i != 1 ? "months" : "weeks";
        }
        return "days";
    }

    @Nullable
    public final String getSid() {
        return this.sid;
    }

    public final int getXAxisPosition() {
        return this.xAxisPosition;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putSerializable("saved_date", this.mCurrentDate);
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment, miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Logger.d(this.logTag, getClass().getSimpleName() + ",onViewCreated");
        setActionBarDisplayable(false);
        FragmentActivity mActivity = getMActivity();
        Intrinsics.checkNotNull(mActivity);
        this.basicDataViewModel = (BasicRelativeDataViewModel) new ViewModelProvider(mActivity).get(BasicRelativeDataViewModel.class);
        this.xAxisPosition = xAxisPosition();
        if (savedInstanceState != null) {
            LocalDate localDate = (LocalDate) savedInstanceState.getSerializable("saved_date");
            this.mSavedStateDate = localDate;
            Logger.i(this.logTag, "mSavedStateDate " + localDate);
        }
        refreshSelectDateIfNeed();
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseFragment
    public void onVisible() {
        super.onVisible();
        Logger.d(this.logTag, getClass().getSimpleName() + ",onVisible");
        refreshSelectDateIfNeed();
    }

    public final void setBasicDataViewModel(@Nullable BasicRelativeDataViewModel basicRelativeDataViewModel) {
        this.basicDataViewModel = basicRelativeDataViewModel;
    }

    public final void setMCurrentDate(@Nullable LocalDate localDate) {
        this.mCurrentDate = localDate;
    }

    public final void setMSavedStateDate(@Nullable LocalDate localDate) {
        this.mSavedStateDate = localDate;
    }

    public final void setMSelectChangedListener(@Nullable OnDateSelectChangedListener onDateSelectChangedListener) {
        this.mSelectChangedListener = onDateSelectChangedListener;
    }

    @Override // miuix.appcompat.app.Fragment, androidx.fragment.app.Fragment
    public void setMenuVisibility(boolean menuVisible) {
        super.setMenuVisibility(menuVisible);
        if (getView() != null) {
            requireView().setVisibility(menuVisible ? 0 : 8);
        }
    }

    public final void setOnSelectChangedListener(@NotNull OnDateSelectChangedListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mSelectChangedListener = listener;
    }

    public final void setRelativeUid(long j) {
        this.relativeUid = j;
    }

    public final void setSid(@Nullable String str) {
        this.sid = str;
    }

    public final void setXAxisPosition(int i) {
        this.xAxisPosition = i;
    }

    public abstract int xAxisPosition();
}
