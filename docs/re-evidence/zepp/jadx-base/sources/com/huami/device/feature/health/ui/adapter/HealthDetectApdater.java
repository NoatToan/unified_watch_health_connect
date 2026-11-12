package com.huami.device.feature.health.ui.adapter;

import androidx.fragment.app.Fragment;
import com.chad.library.adapter.base.BaseMultiItemQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.huami.device.feature.health.ui.R;
import com.huami.device.feature.health.ui.item.SettingItem;
import com.huami.device.feature.health.ui.item.TitleItem;
import com.huami.device.feature.health.ui.item.ViewItem;
import com.huami.device.feature.health.ui.item.health.BloodPressureSettingItem;
import com.huami.device.feature.health.ui.model.SettingType;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B5\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012$\u0010\u0016\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00060\u00110\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0014R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR4\u0010\u0016\u001a \u0012\u0004\u0012\u00020\u0010\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00060\u00110\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R6\u0010\u001c\u001a\"\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017j\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0018`\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/huami/device/feature/health/ui/adapter/HealthDetectApdater;", "Lcom/chad/library/adapter/base/BaseMultiItemQuickAdapter;", "Lcom/huami/device/feature/health/ui/item/ViewItem;", "Lcom/chad/library/adapter/base/BaseViewHolder;", "", "data", "", "setNewData", "helper", "item", "convert", "Landroidx/fragment/app/Fragment;", "a", "Landroidx/fragment/app/Fragment;", "fragment", "", "Lcom/huami/device/feature/health/ui/model/SettingType;", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "b", "Ljava/util/Map;", "settingFuncMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "c", "Ljava/util/HashMap;", "cornerMap", "<init>", "(Landroidx/fragment/app/Fragment;Ljava/util/Map;)V", "health-ui_release"}, k = 1, mv = {1, 5, 1})
public final class HealthDetectApdater extends BaseMultiItemQuickAdapter<ViewItem, BaseViewHolder> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Fragment fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Map<SettingType, Function1<Function0<Boolean>, Unit>> settingFuncMap;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final HashMap<Integer, Integer> cornerMap;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"Lkotlin/Function0;", "", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<Function0<? extends Boolean>, Unit> {
        public final /* synthetic */ SettingType a;

        /* JADX INFO: renamed from: com.huami.device.feature.health.ui.adapter.HealthDetectApdater$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0344a extends Lambda implements Function0<String> {
            public final /* synthetic */ SettingType a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0344a(SettingType settingType) {
                super(0);
                this.a = settingType;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "no support func by " + this.a.getType();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SettingType settingType) {
            super(1);
            this.a = settingType;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Function0<? extends Boolean> function0) {
            invoke2((Function0<Boolean>) function0);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull Function0<Boolean> function0) {
            HMLog.info("HealthDetect", new C0344a(this.a));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HealthDetectApdater(@NotNull Fragment fragment, @NotNull Map<SettingType, ? extends Function1<? super Function0<Boolean>, Unit>> map) {
        super(null);
        this.fragment = fragment;
        this.settingFuncMap = map;
        addItemType(1, R.layout.item_health_detect_title);
        addItemType(2, R.layout.item_health_detect);
        this.cornerMap = new HashMap<>();
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void setNewData(@Nullable List<ViewItem> data) {
        this.cornerMap.clear();
        if (data != null) {
            int i = 0;
            for (Object obj : data) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ViewItem viewItem = (ViewItem) obj;
                Integer num = null;
                if (i <= 0 || (viewItem instanceof TitleItem)) {
                    this.cornerMap.put(Integer.valueOf(i), null);
                } else {
                    boolean z = data.get(i - 1) instanceof TitleItem;
                    boolean z2 = i == data.size() - 1 || (data.get(i2) instanceof TitleItem);
                    if (z && z2) {
                        num = 3;
                    } else if (z) {
                        num = 1;
                    } else if (z2) {
                        num = 2;
                    }
                    this.cornerMap.put(Integer.valueOf(i), num);
                }
                i = i2;
            }
        }
        super.setNewData(data);
    }

    @Override // com.chad.library.adapter.base.BaseQuickAdapter
    public void convert(@NotNull BaseViewHolder helper, @NotNull ViewItem item) {
        if (item instanceof TitleItem) {
            TitleItem titleItem = (TitleItem) item;
            helper.setText(R.id.title_text, titleItem.getTitle());
            helper.setText(R.id.learn_more, titleItem.getButton());
        } else if (item instanceof SettingItem) {
            int adapterPosition = helper.getAdapterPosition();
            SettingType settingType = item instanceof BloodPressureSettingItem ? SettingType.BloodPressure.INSTANCE : SettingType.Other.INSTANCE;
            SettingItem settingItem = (SettingItem) item;
            Fragment fragment = this.fragment;
            ListTile listTile = (ListTile) helper.itemView;
            Integer num = this.cornerMap.get(Integer.valueOf(adapterPosition));
            Function1<Function0<Boolean>, Unit> aVar = this.settingFuncMap.get(settingType);
            if (aVar == null) {
                aVar = new a(settingType);
            }
            settingItem.bindItemView(fragment, listTile, num, aVar);
        }
    }
}
