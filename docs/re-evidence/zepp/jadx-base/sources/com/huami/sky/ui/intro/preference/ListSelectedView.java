package com.huami.sky.ui.intro.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LayoutAnimationController;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.sky.lib.entity.MusicPreference;
import com.huami.sky.lib.entity.MusicPreferenceItem;
import com.huami.sky.ui.R;
import com.huami.tools.analytics.DbUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010(\u001a\u00020'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\b\u0002\u0010+\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007J\b\u0010\r\u001a\u0004\u0018\u00010\fR\u001d\u0010\u0011\u001a\u00020\f8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014RÄ\u0001\u0010&\u001aO\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016j\u0004\u0018\u0001`\u001e2S\u0010\u001f\u001aO\u0012\u0013\u0012\u00110\b¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0016j\u0004\u0018\u0001`\u001e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006."}, d2 = {"Lcom/huami/sky/ui/intro/preference/ListSelectedView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "a", "Lcom/huami/sky/lib/entity/MusicPreference;", "info", "setDataSource", "Lkotlin/Pair;", "", "", "Lcom/huami/sky/lib/entity/MusicPreferenceItem;", "getSelectItems", "Lcom/huami/sky/ui/intro/preference/MusicPreferenceAdapter;", "getMusicAdapter", "Lkotlin/Lazy;", "getMusicPreferenceAdapter", "()Lcom/huami/sky/ui/intro/preference/MusicPreferenceAdapter;", "musicPreferenceAdapter", "Lcom/huami/sky/ui/intro/preference/SelectedAdapter;", "b", "Lcom/huami/sky/ui/intro/preference/SelectedAdapter;", "mAdapter", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "questionTag", "", "index", "", "isSelected", "Lcom/huami/sky/ui/intro/preference/ItemClickListener;", "value", "c", "Lkotlin/jvm/functions/Function3;", "getItemClickListener", "()Lkotlin/jvm/functions/Function3;", "setItemClickListener", "(Lkotlin/jvm/functions/Function3;)V", "itemClickListener", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/util/AttributeSet;", "attrs", "defStyleArr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "sky-ui_release"}, k = 1, mv = {1, 5, 1})
public final class ListSelectedView extends RecyclerView {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy musicPreferenceAdapter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private SelectedAdapter mAdapter;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Function3<? super String, ? super Integer, ? super Boolean, Unit> itemClickListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/sky/ui/intro/preference/MusicPreferenceAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MusicPreferenceAdapter> {
        public final /* synthetic */ Context a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MusicPreferenceAdapter invoke() {
            return new MusicPreferenceAdapter(this.a);
        }
    }

    @JvmOverloads
    public ListSelectedView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public ListSelectedView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ListSelectedView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void a() {
        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(AnimationUtils.loadAnimation(getContext(), R.anim.sky_question_item_anim));
        layoutAnimationController.setOrder(0);
        layoutAnimationController.setDelay(0.2f);
        setLayoutAnimation(layoutAnimationController);
    }

    private final MusicPreferenceAdapter getMusicPreferenceAdapter() {
        return (MusicPreferenceAdapter) this.musicPreferenceAdapter.getValue();
    }

    @Nullable
    public final Function3<String, Integer, Boolean, Unit> getItemClickListener() {
        return this.itemClickListener;
    }

    @Nullable
    public final MusicPreferenceAdapter getMusicAdapter() {
        SelectedAdapter selectedAdapter = this.mAdapter;
        if (selectedAdapter instanceof MusicPreferenceAdapter) {
            return (MusicPreferenceAdapter) selectedAdapter;
        }
        return null;
    }

    @Nullable
    public final Pair<String, List<MusicPreferenceItem>> getSelectItems() {
        SelectedAdapter selectedAdapter = this.mAdapter;
        if (selectedAdapter == null) {
            return null;
        }
        List<SelectEntity> dataLists = selectedAdapter.getDataLists();
        ArrayList arrayList = new ArrayList();
        for (SelectEntity selectEntity : dataLists) {
            MusicPreferenceItem preferenceItem = selectEntity.isSelected() ? selectEntity.getPreferenceItem() : null;
            if (preferenceItem != null) {
                arrayList.add(preferenceItem);
            }
        }
        return TuplesKt.to(selectedAdapter.getQuestionTag(), arrayList);
    }

    public final void setDataSource(@NotNull MusicPreference info) {
        a();
        MusicPreferenceAdapter musicPreferenceAdapter = getMusicPreferenceAdapter();
        musicPreferenceAdapter.setQuestionName(info.getTitle());
        musicPreferenceAdapter.setQuestionSubTitle(info.getSubTitle());
        musicPreferenceAdapter.setItemClick(getItemClickListener());
        this.mAdapter = musicPreferenceAdapter;
        List<MusicPreferenceItem> items = info.getItems();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(items, 10));
        for (MusicPreferenceItem musicPreferenceItem : items) {
            arrayList.add(new SelectEntity(musicPreferenceItem, musicPreferenceItem.isSelected(), 2));
        }
        musicPreferenceAdapter.updateDataSource(arrayList);
        Unit unit = Unit.INSTANCE;
        setAdapter(musicPreferenceAdapter);
    }

    public final void setItemClickListener(@Nullable Function3<? super String, ? super Integer, ? super Boolean, Unit> function3) {
        this.itemClickListener = function3;
        SelectedAdapter selectedAdapter = this.mAdapter;
        if (selectedAdapter == null) {
            return;
        }
        selectedAdapter.setItemClick(function3);
    }

    @JvmOverloads
    public ListSelectedView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.musicPreferenceAdapter = LazyKt__LazyJVMKt.lazy(new a(context));
        setLayoutManager(new LinearLayoutManager(context));
        setOverScrollMode(2);
        setItemViewCacheSize(10);
        setItemAnimator(null);
    }
}
