package com.xiaomi.fitness.devicesettings.bluttooth.audio;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.p;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.PhoneListAdapter;
import com.xiaomi.fitness.devicesettings.bluttooth.audio.util.DurationMappingUtils;
import com.xiaomi.fitness.devicesettings.utils.UtilsKt;
import com.xiaomi.fitness.extensions.ViewExtKt;
import defpackage.gk6;
import defpackage.jni;
import defpackage.wzi;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 <2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003=><B5\u0012\u0006\u0010#\u001a\u00020\"\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)\u0012\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u000100¢\u0006\u0004\b:\u0010;J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u001f\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\b2\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010!\u001a\u00020\b2\u001a\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\b0\u001c¢\u0006\u0004\b!\u0010\u001fR\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R0\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u0001008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R,\u00107\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R,\u00109\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\b\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108¨\u0006?"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/PhoneListAdapter;", "Landroidx/recyclerview/widget/p;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/PhoneListAdapter$MobilePhoneStorageHolder;", "holder", "", "position", "", "bindMobilePhoneData", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/PhoneListAdapter$MobilePhoneStorageHolder;I)V", "data", "", "getContent", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;)Ljava/lang/String;", "", "seconds", "secondsToStr", "(J)Ljava/lang/String;", "time", "longTime2timeStr", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$d0;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$d0;I)V", "Lkotlin/Function2;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setClickListener", "(Lkotlin/jvm/functions/Function2;)V", "", "setSeekBarListener", "Landroid/content/Context;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "setDataList", "(Ljava/util/List;)V", "Lkotlin/Function1;", "onItemClick", "Lkotlin/jvm/functions/Function1;", "getOnItemClick", "()Lkotlin/jvm/functions/Function1;", "setOnItemClick", "(Lkotlin/jvm/functions/Function1;)V", "clickListener", "Lkotlin/jvm/functions/Function2;", "seekBarListener", "<init>", "(Landroid/content/Context;Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Companion", "MobilePhoneStorageHolder", "DiffCallback", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nPhoneListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneListAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/PhoneListAdapter\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n256#2,2:260\n256#2,2:262\n256#2,2:264\n1872#3,3:266\n*S KotlinDebug\n*F\n+ 1 PhoneListAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/PhoneListAdapter\n*L\n158#1:260,2\n165#1:262,2\n179#1:264,2\n188#1:266,3\n*E\n"})
public final class PhoneListAdapter extends p<AudioRecordEntity, RecyclerView.d0> {
    public static final int CLICK_DELETE = 2;
    public static final int CLICK_ITEM = 1;
    public static final int CLICK_PLAY = 5;
    public static final int CLICK_SHARE = 3;
    public static final int CLICK_TRANS = 4;

    @Nullable
    private Function2<? super Integer, ? super Integer, Unit> clickListener;

    @NotNull
    private Context context;

    @NotNull
    private List<AudioRecordEntity> dataList;

    @Nullable
    private Function1<? super AudioRecordEntity, Unit> onItemClick;

    @Nullable
    private Function2<? super Boolean, ? super Integer, Unit> seekBarListener;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/PhoneListAdapter$DiffCallback;", "Landroidx/recyclerview/widget/h$f;", "Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;", "oldItem", "newItem", "", "areItemsTheSame", "(Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/AudioRecordEntity;)Z", "areContentsTheSame", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nPhoneListAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneListAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/PhoneListAdapter$DiffCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,259:1\n1863#2,2:260\n1863#2,2:262\n*S KotlinDebug\n*F\n+ 1 PhoneListAdapter.kt\ncom/xiaomi/fitness/devicesettings/bluttooth/audio/PhoneListAdapter$DiffCallback\n*L\n222#1:260,2\n225#1:262,2\n*E\n"})
    public static final class DiffCallback extends h.f<AudioRecordEntity> {
        @Override // androidx.recyclerview.widget.h.f
        public boolean areContentsTheSame(@NotNull AudioRecordEntity oldItem, @NotNull AudioRecordEntity newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            List<AsrResultItem> contentList = oldItem.getContentList();
            if (contentList != null) {
                Iterator<T> it = contentList.iterator();
                while (it.hasNext()) {
                    sb.append(((AsrResultItem) it.next()).getContent());
                }
            }
            List<AsrResultItem> contentList2 = newItem.getContentList();
            if (contentList2 != null) {
                Iterator<T> it2 = contentList2.iterator();
                while (it2.hasNext()) {
                    sb2.append(((AsrResultItem) it2.next()).getContent());
                }
            }
            return oldItem.getStatus() == newItem.getStatus() && Intrinsics.areEqual(sb.toString(), sb2.toString()) && Intrinsics.areEqual(oldItem.getTitle(), newItem.getTitle()) && oldItem.getAudioPlayStatus() == newItem.getAudioPlayStatus() && oldItem.getAudioPlayCurrentTimes() == newItem.getAudioPlayCurrentTimes();
        }

        @Override // androidx.recyclerview.widget.h.f
        public boolean areItemsTheSame(@NotNull AudioRecordEntity oldItem, @NotNull AudioRecordEntity newItem) {
            Intrinsics.checkNotNullParameter(oldItem, "oldItem");
            Intrinsics.checkNotNullParameter(newItem, "newItem");
            return oldItem.getTimestamp() == newItem.getTimestamp();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/audio/PhoneListAdapter$MobilePhoneStorageHolder;", "Landroidx/recyclerview/widget/RecyclerView$d0;", "Lgk6;", "bind", "Lgk6;", "getBind", "()Lgk6;", "<init>", "(Lgk6;)V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
    public static final class MobilePhoneStorageHolder extends RecyclerView.d0 {

        @NotNull
        private final gk6 bind;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MobilePhoneStorageHolder(@NotNull gk6 bind) {
            super(bind.getRoot());
            Intrinsics.checkNotNullParameter(bind, "bind");
            this.bind = bind;
        }

        @NotNull
        public final gk6 getBind() {
            return this.bind;
        }
    }

    public /* synthetic */ PhoneListAdapter(Context context, List list, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, list, (i & 4) != 0 ? null : function1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00bb  */
    private final void bindMobilePhoneData(MobilePhoneStorageHolder holder, int position) {
        if (holder == null) {
            return;
        }
        AudioRecordEntity audioRecordEntity = getCurrentList().get(position);
        gk6 bind = holder.getBind();
        bind.G.setText(UtilsKt.simpleRecordFileName(audioRecordEntity.getNewTitle()));
        bind.L.setText(TimeUtils.INSTANCE.getNewDateString(audioRecordEntity.getTimestamp()));
        bind.F.setText(secondsToStr(audioRecordEntity.getDuration()));
        TextView textView = bind.B;
        Intrinsics.checkNotNull(audioRecordEntity);
        String content = getContent(audioRecordEntity);
        if (StringsKt__StringsKt.isBlank(content) || content.length() == 0) {
            Intrinsics.checkNotNull(textView);
            ViewExtKt.gone(textView);
        } else {
            Intrinsics.checkNotNull(textView);
            ViewExtKt.visible(textView);
            textView.setText(getContent(audioRecordEntity));
        }
        if (!AppUtil.INSTANCE.isPlayChannel()) {
            int status = audioRecordEntity.getStatus();
            if (status == 1) {
                ImageView trans2txtView = bind.N;
                Intrinsics.checkNotNullExpressionValue(trans2txtView, "trans2txtView");
                ViewExtKt.gone(trans2txtView);
                TextView statusView = bind.K;
                Intrinsics.checkNotNullExpressionValue(statusView, "statusView");
                ViewExtKt.gone(statusView);
            } else if (status == 2) {
                ImageView trans2txtView2 = bind.N;
                Intrinsics.checkNotNullExpressionValue(trans2txtView2, "trans2txtView");
                ViewExtKt.visible(trans2txtView2);
                bind.N.setEnabled(false);
                TextView textView2 = bind.K;
                Intrinsics.checkNotNull(textView2);
                ViewExtKt.visible(textView2);
                textView2.setText(ResourceExtKt.getString(wzi.E0));
                textView2.setTextColor(Color.parseColor("#45B4FF"));
                textView2.setBackgroundResource(jni.w);
            } else if (status == 3) {
                ImageView trans2txtView3 = bind.N;
                Intrinsics.checkNotNullExpressionValue(trans2txtView3, "trans2txtView");
                ViewExtKt.visible(trans2txtView3);
                bind.N.setEnabled(true);
                TextView textView3 = bind.K;
                Intrinsics.checkNotNull(textView3);
                ViewExtKt.visible(textView3);
                textView3.setText(ResourceExtKt.getString(wzi.C0));
                textView3.setTextColor(Color.parseColor("#F22424"));
                textView3.setBackgroundResource(jni.v);
            } else if (status == 4) {
                TextView statusView2 = bind.K;
                Intrinsics.checkNotNullExpressionValue(statusView2, "statusView");
                ViewExtKt.gone(statusView2);
            } else if (status == 5) {
                ImageView trans2txtView4 = bind.N;
                Intrinsics.checkNotNullExpressionValue(trans2txtView4, "trans2txtView");
                ViewExtKt.visible(trans2txtView4);
                bind.N.setEnabled(false);
                TextView textView4 = bind.K;
                Intrinsics.checkNotNull(textView4);
                ViewExtKt.visible(textView4);
                textView4.setText(ResourceExtKt.getString(wzi.E0));
                textView4.setTextColor(Color.parseColor("#45B4FF"));
                textView4.setBackgroundResource(jni.w);
            }
        }
        int audioPlayStatus = audioRecordEntity.getAudioPlayStatus();
        if (audioPlayStatus == 0) {
            bind.H.setImageResource(jni.u);
            bind.H.setContentDescription(this.context.getString(wzi.l6));
            ConstraintLayout audioPlayLayout = bind.A;
            Intrinsics.checkNotNullExpressionValue(audioPlayLayout, "audioPlayLayout");
            audioPlayLayout.setVisibility(8);
            return;
        }
        if (audioPlayStatus != 1) {
            if (audioPlayStatus != 2) {
                return;
            }
            bind.H.setImageResource(jni.u);
            bind.H.setContentDescription(this.context.getString(wzi.l6));
            ConstraintLayout audioPlayLayout2 = bind.A;
            Intrinsics.checkNotNullExpressionValue(audioPlayLayout2, "audioPlayLayout");
            audioPlayLayout2.setVisibility(0);
            bind.I.setProgress((int) audioRecordEntity.getAudioPlayCurrentTimes());
            return;
        }
        bind.H.setImageResource(jni.o);
        bind.H.setContentDescription(this.context.getString(wzi.h8));
        ConstraintLayout audioPlayLayout3 = bind.A;
        Intrinsics.checkNotNullExpressionValue(audioPlayLayout3, "audioPlayLayout");
        audioPlayLayout3.setVisibility(0);
        long j = 1000;
        bind.C.setText(longTime2timeStr(DurationMappingUtils.INSTANCE.getMappingDuration(audioRecordEntity.getDuration() * j, audioRecordEntity.getAudioTotalTimes(), audioRecordEntity.getAudioPlayCurrentTimes())));
        bind.M.setText(longTime2timeStr(audioRecordEntity.getDuration() * j));
        long audioTotalTimes = audioRecordEntity.getAudioTotalTimes();
        long audioPlayCurrentTimes = audioRecordEntity.getAudioPlayCurrentTimes();
        StringBuilder sb = new StringBuilder();
        sb.append("total ");
        sb.append(audioTotalTimes);
        sb.append(" play ");
        sb.append(audioPlayCurrentTimes);
        bind.I.setMax((int) audioRecordEntity.getAudioTotalTimes());
        bind.I.setProgress((int) audioRecordEntity.getAudioPlayCurrentTimes());
    }

    private final String getContent(AudioRecordEntity data) {
        StringBuilder sb = new StringBuilder();
        List<AsrResultItem> contentList = data.getContentList();
        if (contentList != null) {
            int i = 0;
            for (Object obj : contentList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                AsrResultItem asrResultItem = (AsrResultItem) obj;
                if (i < 10) {
                    sb.append(asrResultItem.getContent());
                }
                i = i2;
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private final String longTime2timeStr(long time) {
        Object objValueOf;
        Object objValueOf2;
        long j = time / ((long) 1000);
        long j2 = 60;
        long j3 = j / j2;
        if (j3 < 10) {
            objValueOf = "0" + j3;
        } else {
            objValueOf = Long.valueOf(j3);
        }
        long j4 = j % j2;
        if (j4 < 10) {
            objValueOf2 = "0" + j4;
        } else {
            objValueOf2 = Long.valueOf(j4);
        }
        return objValueOf + ":" + objValueOf2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$1(PhoneListAdapter this$0, MobilePhoneStorageHolder mobileHolder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mobileHolder, "$mobileHolder");
        Function2<? super Integer, ? super Integer, Unit> function2 = this$0.clickListener;
        if (function2 != null) {
            function2.invoke(2, Integer.valueOf(mobileHolder.getBindingAdapterPosition()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$2(PhoneListAdapter this$0, MobilePhoneStorageHolder mobileHolder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mobileHolder, "$mobileHolder");
        Function2<? super Integer, ? super Integer, Unit> function2 = this$0.clickListener;
        if (function2 != null) {
            function2.invoke(3, Integer.valueOf(mobileHolder.getBindingAdapterPosition()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$3(PhoneListAdapter this$0, MobilePhoneStorageHolder mobileHolder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mobileHolder, "$mobileHolder");
        Function2<? super Integer, ? super Integer, Unit> function2 = this$0.clickListener;
        if (function2 != null) {
            function2.invoke(4, Integer.valueOf(mobileHolder.getBindingAdapterPosition()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBindViewHolder$lambda$4(PhoneListAdapter this$0, MobilePhoneStorageHolder mobileHolder, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(mobileHolder, "$mobileHolder");
        Function2<? super Integer, ? super Integer, Unit> function2 = this$0.clickListener;
        if (function2 != null) {
            function2.invoke(5, Integer.valueOf(mobileHolder.getBindingAdapterPosition()));
        }
    }

    private final String secondsToStr(long seconds) {
        long j = 3600;
        long j2 = seconds / j;
        long j3 = 60;
        long j4 = (seconds % j) / j3;
        long j5 = seconds % j3;
        if (j2 <= 0) {
            return j4 + "m" + j5 + "s";
        }
        return j2 + "h" + j4 + "m" + j5 + "s";
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List<AudioRecordEntity> getDataList() {
        return this.dataList;
    }

    @Nullable
    public final Function1<AudioRecordEntity, Unit> getOnItemClick() {
        return this.onItemClick;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull RecyclerView.d0 holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        final MobilePhoneStorageHolder mobilePhoneStorageHolder = holder instanceof MobilePhoneStorageHolder ? (MobilePhoneStorageHolder) holder : null;
        if (mobilePhoneStorageHolder == null) {
            return;
        }
        bindMobilePhoneData(mobilePhoneStorageHolder, mobilePhoneStorageHolder.getBindingAdapterPosition());
        if (!AppUtil.INSTANCE.isPlayChannel()) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: qth
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PhoneListAdapter.onBindViewHolder$lambda$0(view);
                }
            });
        }
        mobilePhoneStorageHolder.getBind().D.setOnClickListener(new View.OnClickListener() { // from class: rth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneListAdapter.onBindViewHolder$lambda$1(this.f32889a, mobilePhoneStorageHolder, view);
            }
        });
        mobilePhoneStorageHolder.getBind().J.setOnClickListener(new View.OnClickListener() { // from class: sth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneListAdapter.onBindViewHolder$lambda$2(this.f33972a, mobilePhoneStorageHolder, view);
            }
        });
        mobilePhoneStorageHolder.getBind().N.setOnClickListener(new View.OnClickListener() { // from class: tth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneListAdapter.onBindViewHolder$lambda$3(this.f35025a, mobilePhoneStorageHolder, view);
            }
        });
        mobilePhoneStorageHolder.getBind().H.setOnClickListener(new View.OnClickListener() { // from class: uth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhoneListAdapter.onBindViewHolder$lambda$4(this.f36118a, mobilePhoneStorageHolder, view);
            }
        });
        mobilePhoneStorageHolder.getBind().I.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.xiaomi.fitness.devicesettings.bluttooth.audio.PhoneListAdapter.onBindViewHolder.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar p0, int progress, boolean fromUser) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar p0) {
                Function2 function2 = PhoneListAdapter.this.seekBarListener;
                if (function2 != null) {
                    function2.invoke(Boolean.TRUE, null);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar p0) {
                Function2 function2 = PhoneListAdapter.this.seekBarListener;
                if (function2 != null) {
                    function2.invoke(Boolean.FALSE, Integer.valueOf(mobilePhoneStorageHolder.getBind().I.getProgress()));
                }
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public RecyclerView.d0 onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        gk6 gk6VarA0 = gk6.A0(LayoutInflater.from(this.context), parent, false);
        Intrinsics.checkNotNullExpressionValue(gk6VarA0, "inflate(...)");
        return new MobilePhoneStorageHolder(gk6VarA0);
    }

    public final void setClickListener(@NotNull Function2<? super Integer, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.clickListener = listener;
    }

    public final void setContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<set-?>");
        this.context = context;
    }

    public final void setDataList(@NotNull List<AudioRecordEntity> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.dataList = list;
    }

    public final void setOnItemClick(@Nullable Function1<? super AudioRecordEntity, Unit> function1) {
        this.onItemClick = function1;
    }

    public final void setSeekBarListener(@NotNull Function2<? super Boolean, ? super Integer, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.seekBarListener = listener;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneListAdapter(@NotNull Context context, @NotNull List<AudioRecordEntity> dataList, @Nullable Function1<? super AudioRecordEntity, Unit> function1) {
        super(new DiffCallback());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataList, "dataList");
        this.context = context;
        this.dataList = dataList;
        this.onItemClick = function1;
    }
}
