package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.voice;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.devicex.R;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.device.introduce.IntroduceShuffleFactoryKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB\u001f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0016R$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceLanguageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceViewHolder;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "getItemCount", "holder", "position", "", "onBindViewHolder", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "a", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "getEnum", "()Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "setEnum", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;)V", "enum", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceLanguageListener;", "b", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceLanguageListener;", "getSelectListener", "()Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceLanguageListener;", "setSelectListener", "(Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceLanguageListener;)V", "selectListener", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceLanguageListener;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class OfflineVoiceLanguageAdapter extends RecyclerView.Adapter<OfflineVoiceViewHolder> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final HashMap<OfflineVoiceLanguage, String> c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private EnumData enum;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private OfflineVoiceLanguageListener selectListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002J\n\u0010\n\u001a\u00020\t*\u00020\bJ\u0010\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f*\u00020\u000bR5\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u000ej\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t`\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceLanguageAdapter$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "drawableRes", "Landroid/graphics/drawable/Drawable;", "a", "Lcom/xiaomi/hm/health/device/setting/ui/subview/watchsetting/voice/OfflineVoiceLanguage;", "", "getDesc", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/EnumData;", "", "filterUnSet", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", SportAnalytics.ParamValue.MapButtonType.MAP, "Ljava/util/HashMap;", "getMap", "()Ljava/util/HashMap;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Drawable a(Context context, @DrawableRes int drawableRes) {
            Drawable drawable = ContextCompat.getDrawable(context, drawableRes);
            if (drawable == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                drawable.setTint(ContextCompat.getColor(context, R.color.check_color));
                return drawable;
            }
            drawable.mutate().setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(context, R.color.s1), PorterDuff.Mode.SRC_IN));
            return drawable;
        }

        @NotNull
        public final List<Integer> filterUnSet(@NotNull EnumData enumData) {
            ArrayList<Integer> enums = enumData.getEnums();
            ArrayList arrayList = new ArrayList();
            for (Object obj : enums) {
                if (((Number) obj).intValue() != OfflineVoiceLanguage.UN_SET.getIndex()) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        }

        @NotNull
        public final String getDesc(@NotNull OfflineVoiceLanguage offlineVoiceLanguage) {
            String str = getMap().get(offlineVoiceLanguage);
            return str == null ? "" : str;
        }

        @NotNull
        public final HashMap<OfflineVoiceLanguage, String> getMap() {
            return OfflineVoiceLanguageAdapter.c;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
        public final /* synthetic */ Integer a;
        public final /* synthetic */ OfflineVoiceLanguageAdapter b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Integer num, OfflineVoiceLanguageAdapter offlineVoiceLanguageAdapter) {
            super(1);
            this.a = num;
            this.b = offlineVoiceLanguageAdapter;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            Integer num = this.a;
            if (num == null) {
                return;
            }
            OfflineVoiceLanguageAdapter offlineVoiceLanguageAdapter = this.b;
            int iIntValue = num.intValue();
            OfflineVoiceLanguageListener selectListener = offlineVoiceLanguageAdapter.getSelectListener();
            if (selectListener == null) {
                return;
            }
            selectListener.onSelect(iIntValue);
        }
    }

    static {
        HashMap<OfflineVoiceLanguage, String> map = new HashMap<>();
        map.put(OfflineVoiceLanguage.SIMPLE_CHINESE, IntroduceShuffleFactoryKt.getString(R.string.offline_voice_language_simple_chinese));
        map.put(OfflineVoiceLanguage.ENGLISH, IntroduceShuffleFactoryKt.getString(R.string.offline_voice_language_english));
        map.put(OfflineVoiceLanguage.GERMAN, IntroduceShuffleFactoryKt.getString(R.string.offline_voice_language_german));
        map.put(OfflineVoiceLanguage.SPANISH, IntroduceShuffleFactoryKt.getString(R.string.offline_voice_language_spanish));
        map.put(OfflineVoiceLanguage.ITALIAN, IntroduceShuffleFactoryKt.getString(R.string.offline_voice_language_italian));
        map.put(OfflineVoiceLanguage.RUSSIAN, IntroduceShuffleFactoryKt.getString(R.string.offline_voice_language_russian));
        c = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OfflineVoiceLanguageAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ OfflineVoiceLanguageAdapter(EnumData enumData, OfflineVoiceLanguageListener offlineVoiceLanguageListener, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : enumData, (i & 2) != 0 ? null : offlineVoiceLanguageListener);
    }

    @Nullable
    public final EnumData getEnum() {
        return this.enum;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getPagerCount() {
        EnumData enumData = this.enum;
        if (enumData == null) {
            return 0;
        }
        return INSTANCE.filterUnSet(enumData).size();
    }

    @Nullable
    public final OfflineVoiceLanguageListener getSelectListener() {
        return this.selectListener;
    }

    public final void setEnum(@Nullable EnumData enumData) {
        this.enum = enumData;
    }

    public final void setSelectListener(@Nullable OfflineVoiceLanguageListener offlineVoiceLanguageListener) {
        this.selectListener = offlineVoiceLanguageListener;
    }

    public OfflineVoiceLanguageAdapter(@Nullable EnumData enumData, @Nullable OfflineVoiceLanguageListener offlineVoiceLanguageListener) {
        this.enum = enumData;
        this.selectListener = offlineVoiceLanguageListener;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(@NotNull OfflineVoiceViewHolder holder, int position) {
        Integer numValueOf;
        EnumData enumData = this.enum;
        List<Integer> listFilterUnSet = enumData == null ? null : INSTANCE.filterUnSet(enumData);
        if (listFilterUnSet == null) {
            numValueOf = null;
        } else {
            EnumData enumData2 = this.enum;
            numValueOf = Integer.valueOf(CollectionsKt___CollectionsKt.indexOf((List<? extends Object>) ((List) listFilterUnSet), (Object) (enumData2 == null ? null : Integer.valueOf(enumData2.getValue()))));
        }
        Integer num = listFilterUnSet != null ? listFilterUnSet.get(position) : null;
        holder.getLanguageTile().setLeading((numValueOf != null && position == numValueOf.intValue()) ? INSTANCE.a(holder.getLanguageTile().getContext(), R.drawable.ic_all_done_20_2x) : ContextCompat.getDrawable(holder.getLanguageTile().getContext(), R.drawable.rainbow_bg_list_tile_leading_20));
        if (num != null) {
            holder.getLanguageTile().setTitle(INSTANCE.getDesc(OfflineVoiceLanguage.INSTANCE.fromValue(num.intValue())));
        }
        ExtKt.smartClick$default(holder.getCom.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY java.lang.String(), 0L, new a(num, this), 1, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NotNull
    public OfflineVoiceViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        return new OfflineVoiceViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_offline_voice_language, parent, false));
    }
}
