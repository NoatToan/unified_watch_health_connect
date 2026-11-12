package com.xiaomi.hm.health.play.card;

import android.content.Context;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.healthlabel.utils.HealthLabelAnalyticsKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.ArraysUtil;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.play.PlayTabType;
import com.xiaomi.hm.health.play.PlayTool;
import com.xiaomi.hm.health.smalltool.model.ToolKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0012¢\u0006\u0004\b*\u0010+J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u001c\u0010\t\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007J!\u0010\r\u001a\u00020\u00052\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0019\u0010\u0017\u001a\u00020\u00128\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u00020\u00188B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0013\u0010\u001bR\u001d\u0010 \u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u0019\u0010\u001fR\u001d\u0010%\u001a\u00020!8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010$R\u001d\u0010)\u001a\u00020&8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b\u001e\u0010(¨\u0006-"}, d2 = {"Lcom/xiaomi/hm/health/play/card/CardManager;", "", "", "Lcom/xiaomi/hm/health/play/PlayTool;", HealthLabelAnalyticsKt.TAG_HOME_LABEL_COUNT, "", "a", "Lcom/xiaomi/hm/health/play/PlayTabType;", "tabType", "updateCardUi", "", "", "key", "removeCardInstance", "([Ljava/lang/String;)V", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroidx/lifecycle/LifecycleOwner;", "b", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lcom/xiaomi/hm/health/play/card/CardAdapter;", "c", "Lkotlin/Lazy;", "()Lcom/xiaomi/hm/health/play/card/CardAdapter;", "cardAdapter", "Landroidx/recyclerview/widget/GridLayoutManager;", GoogleApiAvailabilityLight.a, "()Landroidx/recyclerview/widget/GridLayoutManager;", "cardLayoutManager", "Landroidx/recyclerview/widget/RecyclerView;", "e", "getCardContainer", "()Landroidx/recyclerview/widget/RecyclerView;", "cardContainer", "Lcom/xiaomi/hm/health/play/card/CardRenderFactory;", "f", "()Lcom/xiaomi/hm/health/play/card/CardRenderFactory;", "cardRenderFactory", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;)V", "Companion", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CardManager {

    @NotNull
    private static final String g = "CardManager";
    private static final int h = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardAdapter = LazyKt__LazyJVMKt.lazy(a.a);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardLayoutManager = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardContainer = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy cardRenderFactory = LazyKt__LazyJVMKt.lazy(d.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/play/card/CardAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<CardAdapter> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CardAdapter invoke() {
            return new CardAdapter();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<RecyclerView> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclerView invoke() {
            RecyclerView recyclerView = new RecyclerView(CardManager.this.context);
            CardManager cardManager = CardManager.this;
            recyclerView.setAdapter(cardManager.b());
            recyclerView.setLayoutManager(cardManager.c());
            recyclerView.setPadding(CardManagerKt.a(recyclerView.getContext(), 4), CardManagerKt.a(recyclerView.getContext(), 6), CardManagerKt.a(recyclerView.getContext(), 4), CardManagerKt.a(recyclerView.getContext(), 6));
            recyclerView.setClipToPadding(false);
            recyclerView.setOverScrollMode(2);
            recyclerView.setItemViewCacheSize(10);
            return recyclerView;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/recyclerview/widget/GridLayoutManager;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<GridLayoutManager> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final GridLayoutManager invoke() {
            return new GridLayoutManager(CardManager.this.context, 2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/play/card/CardRenderFactory;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<CardRenderFactory> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CardRenderFactory invoke() {
            return new CardRenderFactory();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ List<PlayTool> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(List<PlayTool> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "updateCardUi after calculateIsLongCard cardsList: " + ArraysUtil.toString(this.a);
        }
    }

    public CardManager(@NotNull Context context, @NotNull LifecycleOwner lifecycleOwner) {
        this.context = context;
        this.lifecycleOwner = lifecycleOwner;
    }

    private final void a(List<PlayTool> cards) {
        int i = 0;
        while (i < cards.size()) {
            PlayTool playTool = cards.get(i);
            if (i == cards.size() - 1) {
                if (playTool.isLongCard()) {
                    return;
                }
                playTool.setLongCard(true);
                return;
            } else if (playTool.isLongCard()) {
                i++;
            } else if (cards.get(i + 1).isLongCard()) {
                playTool.setLongCard(true);
            } else {
                i += 2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CardAdapter b() {
        return (CardAdapter) this.cardAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GridLayoutManager c() {
        return (GridLayoutManager) this.cardLayoutManager.getValue();
    }

    private final CardRenderFactory d() {
        return (CardRenderFactory) this.cardRenderFactory.getValue();
    }

    @NotNull
    public final RecyclerView getCardContainer() {
        return (RecyclerView) this.cardContainer.getValue();
    }

    @NotNull
    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final void removeCardInstance(@NotNull String... key) {
        int length = key.length;
        int i = 0;
        while (i < length) {
            String str = key[i];
            i++;
            d().removeCardRender(str);
        }
    }

    public final void updateCardUi(@NotNull List<PlayTool> cards, @NotNull PlayTabType tabType) {
        final ArrayList<PlayTool> arrayList = new ArrayList();
        for (Object obj : cards) {
            if (((PlayTool) obj).isShow()) {
                arrayList.add(obj);
            }
        }
        a(arrayList);
        HMLog.info(g, new e(cards));
        c().setSpanSizeLookup(!Language.isChinese() ? new GridLayoutManager.SpanSizeLookup() { // from class: com.xiaomi.hm.health.play.card.CardManager.updateCardUi.2
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int position) {
                return CardManager.this.c().getSpanCount();
            }
        } : new GridLayoutManager.SpanSizeLookup() { // from class: com.xiaomi.hm.health.play.card.CardManager.updateCardUi.3
            @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
            public int getSpanSize(int position) {
                if (arrayList.get(position).isLongCard()) {
                    return this.c().getSpanCount();
                }
                return 1;
            }
        });
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (PlayTool playTool : arrayList) {
            arrayList2.add(new CardUiData(playTool, d().getCardRender(getLifecycleOwner(), playTool.getTool().getKey(), tabType)));
        }
        List<CardUiData> mutableList = CollectionsKt___CollectionsKt.toMutableList((Collection) arrayList2);
        CardRenderFactory cardRenderFactoryD = d();
        List<String> arrayList3 = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(mutableList, 10));
        Iterator it2 = mutableList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((CardUiData) it2.next()).getPlayTool().getTool().getKey());
        }
        cardRenderFactoryD.removeCardRenderNotInList(arrayList3);
        if (mutableList.size() == 1 && Intrinsics.areEqual(mutableList.get(0).getPlayTool().getTool().getKey(), ToolKey.EDIT_CARD)) {
            mutableList.clear();
        }
        b().setNewData(mutableList);
    }
}
