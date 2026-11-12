package com.xiaomi.hm.health.play;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.play.health.HealthFragment;
import com.xiaomi.hm.health.play.intelligence.IntelligenceFragment;
import com.xiaomi.hm.health.play.skill.SkillFragment;
import com.xiaomi.hm.health.play.sport.SportFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0007H\u0016J\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0002R\u001c\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R#\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001b¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/play/PlayFragmentAdapter;", "Landroidx/viewpager2/adapter/FragmentStateAdapter;", "", "getItemCount", "position", "Landroidx/fragment/app/Fragment;", "createFragment", "", "getItemId", "itemId", "", "containsItem", "Lcom/xiaomi/hm/health/play/PlayTabType;", "tabType", "", "removeFragment", "index", "addFragment", "isFragmentContains", "getTabType", "", "a", "Ljava/util/List;", "fragmentIds", "", "b", "Lkotlin/Lazy;", "()Ljava/util/List;", "pageIds", "fragment", "<init>", "(Landroidx/fragment/app/Fragment;)V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class PlayFragmentAdapter extends FragmentStateAdapter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final List<PlayTabType> fragmentIds;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy pageIds;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayTabType.values().length];
            iArr[PlayTabType.INTELLIGENCE.ordinal()] = 1;
            iArr[PlayTabType.HEALTH.ordinal()] = 2;
            iArr[PlayTabType.SPORT.ordinal()] = 3;
            iArr[PlayTabType.SKILL.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<List<? extends Long>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final List<? extends Long> invoke() {
            List list = PlayFragmentAdapter.this.fragmentIds;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(((PlayTabType) it2.next()).ordinal()));
            }
            return arrayList;
        }
    }

    public PlayFragmentAdapter(@NotNull Fragment fragment) {
        super(fragment);
        List<PlayTabType> listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(PlayTabType.INTELLIGENCE, PlayTabType.HEALTH, PlayTabType.SPORT);
        this.fragmentIds = listMutableListOf;
        this.pageIds = LazyKt__LazyJVMKt.lazy(new a());
        if (Language.isSimplifiedChinese() || Language.isEnglish()) {
            listMutableListOf.add(PlayTabType.SKILL);
        }
    }

    private final List<Long> a() {
        return (List) this.pageIds.getValue();
    }

    public final void addFragment(int index, @NotNull PlayTabType tabType) {
        if (this.fragmentIds.contains(tabType)) {
            return;
        }
        this.fragmentIds.add(index, tabType);
        notifyItemInserted(index);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public boolean containsItem(long itemId) {
        return a().contains(Long.valueOf(itemId));
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    @NotNull
    public Fragment createFragment(int position) {
        int i = WhenMappings.$EnumSwitchMapping$0[this.fragmentIds.get(position).ordinal()];
        if (i == 1) {
            return new IntelligenceFragment();
        }
        if (i == 2) {
            return new HealthFragment();
        }
        if (i == 3) {
            return new SportFragment();
        }
        if (i == 4) {
            return SkillFragment.INSTANCE.newInstance();
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        return this.fragmentIds.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int position) {
        return this.fragmentIds.get(position).ordinal();
    }

    @NotNull
    public final PlayTabType getTabType(int position) {
        return this.fragmentIds.get(position);
    }

    public final boolean isFragmentContains(@NotNull PlayTabType tabType) {
        return this.fragmentIds.contains(tabType);
    }

    public final void removeFragment(@NotNull PlayTabType tabType) {
        int iIndexOf = this.fragmentIds.indexOf(tabType);
        if (iIndexOf != -1) {
            this.fragmentIds.remove(tabType);
            notifyItemRemoved(iIndexOf);
        }
    }
}
