package com.xiaomi.fitness.sport.view.launch.gym.setting;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fit.fitness.parser.schema.DailyRecordKey;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.sport.extension.RightArraowExtKt;
import com.xiaomi.fitness.sport.view.config.SportConfigConstants;
import com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingItemAdapter;
import com.xiaomi.fitness.sport_manager_export.di.SportManagerExtKt;
import com.xiaomi.fitness.sport_manager_export.launch.ISportRemoteState;
import com.xiaomi.fitness.webview.WebViewUtilKt;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.button.ISwitchButton;
import defpackage.aki;
import defpackage.c1j;
import defpackage.gpn;
import defpackage.i7r;
import defpackage.lcn;
import defpackage.son;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\nABCDEFGHIJB\u0007¢\u0006\u0004\b?\u0010@J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00060\bR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0016\u001a\u00020\u00152\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u00152\u0018\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00150\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ-\u0010\"\u001a\u00020\u00152\u001e\u0010\u001c\u001a\u001a\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00150\u001f¢\u0006\u0004\b\"\u0010#J3\u0010(\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020 0'\"\b\b\u0000\u0010$*\u00020\u00112\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%¢\u0006\u0004\b(\u0010)J\u001f\u0010+\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010*\u001a\u00020 H\u0016¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00022\u0006\u0010.\u001a\u00020 H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020 H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020 2\u0006\u0010.\u001a\u00020 H\u0016¢\u0006\u0004\b3\u00104R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u0011058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R*\u00108\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R0\u0010:\u001a\u001c\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010<R\u0016\u0010=\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006K"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItemHolder;", "Landroid/view/ViewGroup;", "parent", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$LabelSettingItemHolder;", "createLabelSettingItemHolder", "(Landroid/view/ViewGroup;)Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$LabelSettingItemHolder;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$VoiceSpeechSettingItemHolder;", "createVoiceSpeechSettingItemHolder", "(Landroid/view/ViewGroup;)Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$VoiceSpeechSettingItemHolder;", "createArrowSettingItemHolder", "(Landroid/view/ViewGroup;)Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItemHolder;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SwitchSettingItemHolder;", "createSwitchSettingItemHolder", "(Landroid/view/ViewGroup;)Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SwitchSettingItemHolder;", "", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "list", "Llcn;", "sportDB", "", "setDataList", "(Ljava/util/List;Llcn;)V", "getDataList", "()Ljava/util/List;", "Lkotlin/Function2;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$IItemHolder;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnItemClickListener", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function3;", "", "Lcom/xiaomi/fitness/widget/button/ISwitchButton;", "setOnItemSwitchChangedListener", "(Lkotlin/jvm/functions/Function3;)V", "T", "Ljava/lang/Class;", "claz", "Lkotlin/Pair;", "findItem", "(Ljava/lang/Class;)Lkotlin/Pair;", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItemHolder;", "holder", "position", "onBindViewHolder", "(Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItemHolder;I)V", "getItemCount", "()I", "getItemViewType", "(I)I", "", "mDataList", "Ljava/util/List;", "mOnItemCLickListener", "Lkotlin/jvm/functions/Function2;", "mOnItemSwitchChangedListener", "Lkotlin/jvm/functions/Function3;", "Llcn;", DailyRecordKey.sportType, "I", "<init>", "()V", "SettingItemHolder", "IItemHolder", "LabelSettingItemHolder", "SwitchSettingItemHolder", "ArrowSettingItemHolder", "VoiceSpeechSettingItemHolder", "SettingItem", "LabelSettingItem", "SwitchSettingItem", "ArrowSettingItem", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nLocalSportSettingItemAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSportSettingItemAdapter.kt\ncom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,311:1\n1328#2,3:312\n*S KotlinDebug\n*F\n+ 1 LocalSportSettingItemAdapter.kt\ncom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter\n*L\n67#1:312,3\n*E\n"})
public final class LocalSportSettingItemAdapter extends RecyclerView.Adapter<SettingItemHolder> {

    @Nullable
    private Function2<? super SettingItem, ? super IItemHolder, Unit> mOnItemCLickListener;

    @Nullable
    private Function3<? super Integer, ? super ISwitchButton, ? super SettingItem, Unit> mOnItemSwitchChangedListener;

    @Nullable
    private lcn sportDB;

    @NotNull
    private final List<SettingItem> mDataList = new ArrayList();
    private int sportType = 3;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$ArrowSettingItem;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "title", "", "des", "rightValue", "redPointShow", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getRightValue", "()Ljava/lang/String;", "setRightValue", "(Ljava/lang/String;)V", "getRedPointShow", "()Z", "setRedPointShow", "(Z)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class ArrowSettingItem extends SettingItem {
        private boolean redPointShow;

        @NotNull
        private String rightValue;

        public /* synthetic */ ArrowSettingItem(String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? false : z);
        }

        public final boolean getRedPointShow() {
            return this.redPointShow;
        }

        @NotNull
        public final String getRightValue() {
            return this.rightValue;
        }

        public final void setRedPointShow(boolean z) {
            this.redPointShow = z;
        }

        public final void setRightValue(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.rightValue = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArrowSettingItem(@NotNull String title, @NotNull String des, @NotNull String rightValue, boolean z) {
            super(title, des);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(des, "des");
            Intrinsics.checkNotNullParameter(rightValue, "rightValue");
            this.rightValue = rightValue;
            this.redPointShow = z;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$ArrowSettingItemHolder;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItemHolder;", "mArrowView", "Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;", "<init>", "(Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;)V", "bindItem", "", "item", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "setRedPointShow", "show", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ArrowSettingItemHolder extends SettingItemHolder {

        @NotNull
        private final RightArrowTwoLineTextView mArrowView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArrowSettingItemHolder(@NotNull RightArrowTwoLineTextView mArrowView) {
            super(mArrowView);
            Intrinsics.checkNotNullParameter(mArrowView, "mArrowView");
            this.mArrowView = mArrowView;
        }

        @Override // com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingItemAdapter.SettingItemHolder
        public void bindItem(@NotNull SettingItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (!(item instanceof ArrowSettingItem)) {
                onBindUnexpectedItem(item);
                return;
            }
            this.mArrowView.setTitle(item.getTitle());
            this.mArrowView.setSubtitle(item.getDes());
            ArrowSettingItem arrowSettingItem = (ArrowSettingItem) item;
            this.mArrowView.setRemindText(arrowSettingItem.getRightValue());
            RightArraowExtKt.setRedPointShow$default(this.mArrowView, arrowSettingItem.getRedPointShow(), 0, 2, null);
        }

        @Override // com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingItemAdapter.SettingItemHolder, com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingItemAdapter.IItemHolder
        public void setRedPointShow(boolean show) {
            super.setRedPointShow(show);
            if (show) {
                this.mArrowView.setRemindDotColor(ExtUtilsKt.getColor(aki.i));
            } else {
                this.mArrowView.getMTvFeatureItemRemind().setBackground(null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$IItemHolder;", "", "setRedPointShow", "", "show", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface IItemHolder {
        void setRedPointShow(boolean show);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$LabelSettingItem;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "title", "", "des", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LabelSettingItem extends SettingItem {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LabelSettingItem(@NotNull String title, @NotNull String des) {
            super(title, des);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(des, "des");
        }

        public /* synthetic */ LabelSettingItem(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$LabelSettingItemHolder;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItemHolder;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "item", "", "bindItem", "(Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;)V", "Lgpn;", "mViewBinding", "Lgpn;", "<init>", "(Lgpn;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class LabelSettingItemHolder extends SettingItemHolder {

        @NotNull
        private final gpn mViewBinding;

        /* JADX WARN: Illegal instructions before constructor call */
        public LabelSettingItemHolder(@NotNull gpn mViewBinding) {
            Intrinsics.checkNotNullParameter(mViewBinding, "mViewBinding");
            View root = mViewBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root);
            this.mViewBinding = mViewBinding;
        }

        @Override // com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingItemAdapter.SettingItemHolder
        public void bindItem(@NotNull SettingItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.mViewBinding.B.setText(item.getTitle());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "", "title", "", "des", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getDes", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SettingItem {

        @NotNull
        private final String des;

        @NotNull
        private final String title;

        public SettingItem(@NotNull String title, @NotNull String des) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(des, "des");
            this.title = title;
            this.des = des;
        }

        @NotNull
        public final String getDes() {
            return this.des;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\b\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItemHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$IItemHolder;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "item", "", "bindItem", "(Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;)V", "onBindUnexpectedItem", "", "show", "setRedPointShow", "(Z)V", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static abstract class SettingItemHolder extends RecyclerView.d0 implements IItemHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SettingItemHolder(@NotNull View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "view");
        }

        public abstract void bindItem(@NotNull SettingItem item);

        public final void onBindUnexpectedItem(@NotNull SettingItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            Logger.e("SettingItemHolder", "bindItem unexpected item:" + item);
        }

        public void setRedPointShow(boolean show) {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SwitchSettingItemHolder;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItemHolder;", "mSwitchView", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "<init>", "(Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;)V", "getMSwitchView", "()Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "bindItem", "", "item", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SwitchSettingItemHolder extends SettingItemHolder {

        @NotNull
        private final SwitchButtonTwoLineTextView mSwitchView;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwitchSettingItemHolder(@NotNull SwitchButtonTwoLineTextView mSwitchView) {
            super(mSwitchView);
            Intrinsics.checkNotNullParameter(mSwitchView, "mSwitchView");
            this.mSwitchView = mSwitchView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindItem$lambda$0(View view) {
            String model;
            Product product;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel == null || (product = wearableDeviceModel.getProduct()) == null || (model = product.getModel()) == null) {
                model = "";
            }
            String lockScreenUrl = SportConfigConstants.getLockScreenUrl(LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null), model);
            Logger.d("SPORT_SETTING_DEBUG:  url " + lockScreenUrl, new Object[0]);
            WebViewUtilKt.startWebView$default(lockScreenUrl, ResourceExtKt.getString(c1j.H2), true, false, null, false, null, false, 248, null);
        }

        @Override // com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingItemAdapter.SettingItemHolder
        public void bindItem(@NotNull SettingItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            if (!(item instanceof SwitchSettingItem)) {
                onBindUnexpectedItem(item);
                return;
            }
            this.mSwitchView.setTitle(item.getTitle());
            this.mSwitchView.setSubtitle(item.getDes());
            this.mSwitchView.setSwitch(((SwitchSettingItem) item).getIsChecked());
            if (item instanceof LockDisplayDataSettingItem) {
                this.mSwitchView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LocalSportSettingItemAdapter.SwitchSettingItemHolder.bindItem$lambda$0(view);
                    }
                });
            }
        }

        @NotNull
        public final SwitchButtonTwoLineTextView getMSwitchView() {
            return this.mSwitchView;
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$VoiceSpeechSettingItemHolder;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItemHolder;", "Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;", "itemView", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "itemData", "", "setSwitchItem", "(Lcom/xiaomi/fitness/widget/SwitchButtonTwoLineTextView;Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;)V", "Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;", "setArrowItem", "(Lcom/xiaomi/fitness/widget/RightArrowTwoLineTextView;Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;)V", "item", "bindItem", "(Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;)V", "registerListener", "()V", "Lson;", "mViewBinding", "Lson;", "Llcn;", "sportDB", "Llcn;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/WholeKMReminderSettingItem;", "mWholeKMRemindItem", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/WholeKMReminderSettingItem;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/HrRemindSettingItem;", "mHrRemindItem", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/HrRemindSettingItem;", "<init>", "(Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter;Lson;Llcn;)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public final class VoiceSpeechSettingItemHolder extends SettingItemHolder {

        @NotNull
        private final HrRemindSettingItem mHrRemindItem;

        @NotNull
        private final son mViewBinding;

        @NotNull
        private final WholeKMReminderSettingItem mWholeKMRemindItem;

        @Nullable
        private final lcn sportDB;
        final /* synthetic */ LocalSportSettingItemAdapter this$0;

        /* JADX WARN: Illegal instructions before constructor call */
        public VoiceSpeechSettingItemHolder(@NotNull LocalSportSettingItemAdapter localSportSettingItemAdapter, @Nullable son mViewBinding, lcn lcnVar) {
            Intrinsics.checkNotNullParameter(mViewBinding, "mViewBinding");
            this.this$0 = localSportSettingItemAdapter;
            View root = mViewBinding.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
            super(root);
            this.mViewBinding = mViewBinding;
            this.sportDB = lcnVar;
            this.mWholeKMRemindItem = new WholeKMReminderSettingItem();
            this.mHrRemindItem = new HrRemindSettingItem();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void bindItem$lambda$0(VoiceSpeechSettingItemHolder this$0, Boolean bool) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Logger.d("LocalSportSetting", "isSupportLaunchSport it=" + bool);
            AnyExtKt.main$default(null, new LocalSportSettingItemAdapter$VoiceSpeechSettingItemHolder$bindItem$1$1(bool, this$0, null), 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerListener$lambda$1(LocalSportSettingItemAdapter this$0, VoiceSpeechSettingItemHolder this$1, boolean z, ISwitchButton iSwitchButton) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Function3 function3 = this$0.mOnItemSwitchChangedListener;
            if (function3 != null) {
                Integer numValueOf = Integer.valueOf(this$1.getBindingAdapterPosition());
                Intrinsics.checkNotNull(iSwitchButton);
                function3.invoke(numValueOf, iSwitchButton, this$0.mDataList.get(this$1.getBindingAdapterPosition()));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerListener$lambda$2(LocalSportSettingItemAdapter this$0, VoiceSpeechSettingItemHolder this$1, boolean z, ISwitchButton iSwitchButton) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Function3 function3 = this$0.mOnItemSwitchChangedListener;
            if (function3 != null) {
                Integer numValueOf = Integer.valueOf(this$1.getBindingAdapterPosition());
                Intrinsics.checkNotNull(iSwitchButton);
                function3.invoke(numValueOf, iSwitchButton, this$1.mWholeKMRemindItem);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void registerListener$lambda$3(LocalSportSettingItemAdapter this$0, VoiceSpeechSettingItemHolder this$1, View view) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this$1, "this$1");
            Function2 function2 = this$0.mOnItemCLickListener;
            if (function2 != null) {
                function2.invoke(this$1.mHrRemindItem, this$1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setArrowItem(RightArrowTwoLineTextView itemView, SettingItem itemData) {
            itemView.setTitle(itemData.getTitle());
            itemView.setSubtitle(itemData.getDes());
            itemView.setVisibility(this.mViewBinding.D.getSwitch() ? 0 : 8);
        }

        private final void setSwitchItem(SwitchButtonTwoLineTextView itemView, SettingItem itemData) {
            itemView.setTitle(itemData.getTitle());
            itemView.setSubtitle(itemData.getDes());
            itemView.setVisibility(this.mViewBinding.D.getSwitch() ? 0 : 8);
        }

        @Override // com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingItemAdapter.SettingItemHolder
        public void bindItem(@NotNull SettingItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            SwitchButtonTwoLineTextView voiceSpeechView = this.mViewBinding.D;
            Intrinsics.checkNotNullExpressionValue(voiceSpeechView, "voiceSpeechView");
            voiceSpeechView.setTitle(item.getTitle());
            voiceSpeechView.setSubtitle(item.getDes());
            voiceSpeechView.setSwitch(((SwitchSettingItem) item).getIsChecked());
            SwitchButtonTwoLineTextView distanceVoiceSpeechView = this.mViewBinding.A;
            Intrinsics.checkNotNullExpressionValue(distanceVoiceSpeechView, "distanceVoiceSpeechView");
            setSwitchItem(distanceVoiceSpeechView, this.mWholeKMRemindItem);
            this.mViewBinding.A.setSwitch(LocalSportSettingHelper.INSTANCE.isSettingDistanceVoiceSpeech(this.sportDB));
            this.mViewBinding.C.setRemindText("关闭");
            SportManagerExtKt.getInstance(ISportRemoteState.INSTANCE).isSupportLaunchSport(this.this$0.sportType, new i7r() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.e
                @Override // defpackage.i7r
                public final void a(Boolean bool) {
                    LocalSportSettingItemAdapter.VoiceSpeechSettingItemHolder.bindItem$lambda$0(this.f12980a, bool);
                }
            });
        }

        public final void registerListener() {
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView = this.mViewBinding.D;
            final LocalSportSettingItemAdapter localSportSettingItemAdapter = this.this$0;
            switchButtonTwoLineTextView.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.b
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                    LocalSportSettingItemAdapter.VoiceSpeechSettingItemHolder.registerListener$lambda$1(localSportSettingItemAdapter, this, z, iSwitchButton);
                }
            });
            SwitchButtonTwoLineTextView switchButtonTwoLineTextView2 = this.mViewBinding.A;
            final LocalSportSettingItemAdapter localSportSettingItemAdapter2 = this.this$0;
            switchButtonTwoLineTextView2.setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.c
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                    LocalSportSettingItemAdapter.VoiceSpeechSettingItemHolder.registerListener$lambda$2(localSportSettingItemAdapter2, this, z, iSwitchButton);
                }
            });
            RightArrowTwoLineTextView rightArrowTwoLineTextView = this.mViewBinding.B;
            final LocalSportSettingItemAdapter localSportSettingItemAdapter3 = this.this$0;
            rightArrowTwoLineTextView.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.fitness.sport.view.launch.gym.setting.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LocalSportSettingItemAdapter.VoiceSpeechSettingItemHolder.registerListener$lambda$3(localSportSettingItemAdapter3, this, view);
                }
            });
        }
    }

    private final SettingItemHolder createArrowSettingItemHolder(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RightArrowTwoLineTextView rightArrowTwoLineTextView = new RightArrowTwoLineTextView(context, null, 0, 6, null);
        rightArrowTwoLineTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return new ArrowSettingItemHolder(rightArrowTwoLineTextView);
    }

    private final LabelSettingItemHolder createLabelSettingItemHolder(ViewGroup parent) {
        gpn gpnVarA0 = gpn.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(gpnVarA0, "inflate(...)");
        return new LabelSettingItemHolder(gpnVarA0);
    }

    private final SwitchSettingItemHolder createSwitchSettingItemHolder(ViewGroup parent) {
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SwitchButtonTwoLineTextView switchButtonTwoLineTextView = new SwitchButtonTwoLineTextView(context, null, 0, 6, null);
        switchButtonTwoLineTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        return new SwitchSettingItemHolder(switchButtonTwoLineTextView);
    }

    private final VoiceSpeechSettingItemHolder createVoiceSpeechSettingItemHolder(ViewGroup parent) {
        son sonVarA0 = son.A0(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(sonVarA0, "inflate(...)");
        return new VoiceSpeechSettingItemHolder(this, sonVarA0, this.sportDB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(LocalSportSettingItemAdapter this$0, SettingItemHolder holder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Function2<? super SettingItem, ? super IItemHolder, Unit> function2 = this$0.mOnItemCLickListener;
        if (function2 != null) {
            function2.invoke(this$0.mDataList.get(((ArrowSettingItemHolder) holder).getBindingAdapterPosition()), holder);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(LocalSportSettingItemAdapter this$0, SettingItemHolder holder, boolean z, ISwitchButton iSwitchButton) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(holder, "$holder");
        Function3<? super Integer, ? super ISwitchButton, ? super SettingItem, Unit> function3 = this$0.mOnItemSwitchChangedListener;
        if (function3 != null) {
            SwitchSettingItemHolder switchSettingItemHolder = (SwitchSettingItemHolder) holder;
            Integer numValueOf = Integer.valueOf(switchSettingItemHolder.getBindingAdapterPosition());
            Intrinsics.checkNotNull(iSwitchButton);
            function3.invoke(numValueOf, iSwitchButton, this$0.mDataList.get(switchSettingItemHolder.getBindingAdapterPosition()));
        }
    }

    @NotNull
    public final <T extends SettingItem> Pair<T, Integer> findItem(@NotNull Class<T> claz) {
        Intrinsics.checkNotNullParameter(claz, "claz");
        int i = -1;
        SettingItem settingItem = null;
        int i2 = 0;
        for (Object obj : CollectionsKt___CollectionsKt.asSequence(this.mDataList)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            SettingItem settingItem2 = (SettingItem) obj;
            if (Intrinsics.areEqual(settingItem2.getClass(), claz)) {
                Logger.d("LocalSportSetting", "HyTest forEach " + settingItem2.getClass().getName() + " " + i2);
                Intrinsics.checkNotNull(settingItem2, "null cannot be cast to non-null type T of com.xiaomi.fitness.sport.view.launch.gym.setting.LocalSportSettingItemAdapter.findItem$lambda$0");
                i = i2;
                settingItem = settingItem2;
            }
            i2 = i3;
        }
        return new Pair<>(settingItem, Integer.valueOf(i));
    }

    @NotNull
    public final List<SettingItem> getDataList() {
        return this.mDataList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mDataList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position;
    }

    public final void setDataList(@NotNull List<? extends SettingItem> list, @Nullable lcn sportDB) {
        Intrinsics.checkNotNullParameter(list, "list");
        Logger.d("LocalSportSetting", "setDataList " + list.size() + " " + sportDB);
        this.sportDB = sportDB;
        this.mDataList.clear();
        this.mDataList.addAll(list);
        notifyDataSetChanged();
    }

    public final void setOnItemClickListener(@NotNull Function2<? super SettingItem, ? super IItemHolder, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnItemCLickListener = listener;
    }

    public final void setOnItemSwitchChangedListener(@NotNull Function3<? super Integer, ? super ISwitchButton, ? super SettingItem, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mOnItemSwitchChangedListener = listener;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SwitchSettingItem;", "Lcom/xiaomi/fitness/sport/view/launch/gym/setting/LocalSportSettingItemAdapter$SettingItem;", "title", "", "des", "isChecked", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "()Z", "setChecked", "(Z)V", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class SwitchSettingItem extends SettingItem {
        private boolean isChecked;

        public /* synthetic */ SwitchSettingItem(String str, String str2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z);
        }

        /* JADX INFO: renamed from: isChecked, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public final void setChecked(boolean z) {
            this.isChecked = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SwitchSettingItem(@NotNull String title, @NotNull String des, boolean z) {
            super(title, des);
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(des, "des");
            this.isChecked = z;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull final SettingItemHolder holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bindItem(this.mDataList.get(position));
        if (holder instanceof LabelSettingItemHolder) {
            return;
        }
        if (holder instanceof ArrowSettingItemHolder) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: xle
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LocalSportSettingItemAdapter.onBindViewHolder$lambda$1(this.f39239a, holder, view);
                }
            });
            return;
        }
        if (holder instanceof SwitchSettingItemHolder) {
            ((SwitchSettingItemHolder) holder).getMSwitchView().setOnCheckedChangeCallback(new ISwitchButton.a() { // from class: zle
                @Override // com.xiaomi.fitness.widget.button.ISwitchButton.a
                public final void onCheckedChanged(boolean z, ISwitchButton iSwitchButton) {
                    LocalSportSettingItemAdapter.onBindViewHolder$lambda$2(this.f41432a, holder, z, iSwitchButton);
                }
            });
            return;
        }
        if (holder instanceof VoiceSpeechSettingItemHolder) {
            ((VoiceSpeechSettingItemHolder) holder).registerListener();
            return;
        }
        Logger.e("LocalSportSetting", "bind unknown holder:" + holder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public SettingItemHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SettingItem settingItem = this.mDataList.get(viewType);
        if (settingItem instanceof LabelSettingItem) {
            return createLabelSettingItemHolder(parent);
        }
        if (settingItem instanceof SwitchSettingItem) {
            return ((SwitchSettingItem) settingItem) instanceof VoiceSpeechSettingItem ? createVoiceSpeechSettingItemHolder(parent) : createSwitchSettingItemHolder(parent);
        }
        return settingItem instanceof ArrowSettingItem ? createArrowSettingItemHolder(parent) : createSwitchSettingItemHolder(parent);
    }
}
