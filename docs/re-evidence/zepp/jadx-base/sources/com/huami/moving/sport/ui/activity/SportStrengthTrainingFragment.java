package com.huami.moving.sport.ui.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.moving.model.StrengthTrainingAction;
import com.huami.moving.sport.ui.R;
import com.huami.moving.sport.ui.view.bar.BodyPositionView;
import com.huami.moving.utils.StrenthTrainingUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0016\u0010\u000b\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bR1\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\fj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\r8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/moving/sport/ui/activity/SportStrengthTrainingFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "", "", "typeList", "setTypeList", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "a", "Lkotlin/Lazy;", "b", "()Ljava/util/ArrayList;", "<init>", "()V", "Companion", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
public final class SportStrengthTrainingFragment extends Fragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String b = "action_type_list";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy typeList;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/huami/moving/sport/ui/activity/SportStrengthTrainingFragment$Companion;", "", "", "", "typeList", "Landroidx/fragment/app/Fragment;", "newInstance", "", "ACTION_TYPE_LIST", "Ljava/lang/String;", "<init>", "()V", "moving-ui_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final Fragment newInstance(@NotNull List<Integer> typeList) {
            ArrayList<Integer> arrayList;
            SportStrengthTrainingFragment sportStrengthTrainingFragment = new SportStrengthTrainingFragment();
            Bundle bundle = new Bundle();
            if (typeList.isEmpty()) {
                arrayList = new ArrayList<>();
            } else {
                List list = CollectionsKt___CollectionsKt.toList(typeList);
                arrayList = list instanceof ArrayList ? (ArrayList) list : null;
            }
            bundle.putIntegerArrayList(SportStrengthTrainingFragment.b, arrayList);
            Unit unit = Unit.INSTANCE;
            sportStrengthTrainingFragment.setArguments(bundle);
            return sportStrengthTrainingFragment;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000j\n\u0012\u0004\u0012\u00020\u0001\u0018\u0001`\u0002H\n"}, d2 = {"Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ArrayList<Integer>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ArrayList<Integer> invoke() {
            Bundle arguments = SportStrengthTrainingFragment.this.getArguments();
            Object obj = arguments == null ? null : arguments.get(SportStrengthTrainingFragment.b);
            if (obj instanceof ArrayList) {
                return (ArrayList) obj;
            }
            return null;
        }
    }

    public SportStrengthTrainingFragment() {
        super(R.layout.moving_ui_fragment_strength_training_detail);
        this.typeList = LazyKt__LazyJVMKt.lazy(new a());
    }

    private final ArrayList<Integer> b() {
        return (ArrayList) this.typeList.getValue();
    }

    @JvmStatic
    @NotNull
    public static final Fragment newInstance(@NotNull List<Integer> list) {
        return INSTANCE.newInstance(list);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setTypeList(b());
    }

    public final void setTypeList(@Nullable List<Integer> typeList) {
        Context context = getContext();
        if (context == null) {
            return;
        }
        StrenthTrainingUtils.Companion companion = StrenthTrainingUtils.INSTANCE;
        if (typeList == null) {
            typeList = new ArrayList<>();
        }
        List<StrengthTrainingAction> listFindStrenthTrainingByTypeList = companion.findStrenthTrainingByTypeList(context, typeList);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (StrengthTrainingAction strengthTrainingAction : listFindStrenthTrainingByTypeList) {
            arrayList.addAll(ArraysKt___ArraysKt.toList(strengthTrainingAction.getMainPositions()));
            arrayList2.addAll(ArraysKt___ArraysKt.toList(strengthTrainingAction.getSubPositions()));
        }
        View view = getView();
        ((BodyPositionView) (view == null ? null : view.findViewById(R.id.moving_ui_strength_body))).setPositions(arrayList, arrayList2);
        View view2 = getView();
        ((BodyPositionView) (view2 != null ? view2.findViewById(R.id.moving_ui_strength_body_back) : null)).setPositions(arrayList, arrayList2);
    }
}
