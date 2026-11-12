package com.huami.sleepassistant.lib.ui.temperament.sort;

import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelStoreOwner;
import androidx.p012savedstate.SavedStateRegistryOwner;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.text.ttml.b;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.sleepassistant.apilib.db.po.PostLiveMusicSortBean;
import com.huami.sleepassistant.apilib.utils.SerializationKtxKt;
import com.huami.sleepassistant.apilib.vo.LiveMusicVo;
import com.huami.sleepassistant.lib.R;
import com.huami.sleepassistant.lib.ui.temperament.sort.SortCollectionActivity;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.CustomToast;
import com.huami.widget.typeface.TypefaceTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.json.Json;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.androidx.viewmodel.ViewModelOwner;
import org.koin.androidx.viewmodel.ext.android.ComponentCallbackExtKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014R\u001d\u0010\r\u001a\u00020\b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/temperament/sort/SortCollectionActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "", SOAP.XMLNS, b.r, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/sleepassistant/lib/ui/temperament/sort/SortCollectionViewModel;", "x", "Lkotlin/Lazy;", "o", "()Lcom/huami/sleepassistant/lib/ui/temperament/sort/SortCollectionViewModel;", "viewModel", "Lcom/huami/sleepassistant/lib/ui/temperament/sort/MyCallback;", "y", "Lcom/huami/sleepassistant/lib/ui/temperament/sort/MyCallback;", "mMyCallback", "Lcom/huami/sleepassistant/lib/ui/temperament/sort/LiveMusicListAdapter;", "z", "Lcom/huami/sleepassistant/lib/ui/temperament/sort/LiveMusicListAdapter;", "adapter", "", "Lcom/huami/sleepassistant/apilib/vo/LiveMusicVo;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Ljava/util/List;", "list", "<init>", "()V", "Companion", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class SortCollectionActivity extends BaseTitleActivity {

    @NotNull
    public static final String KEY = "KEY";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    private List<LiveMusicVo> list;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    private MyCallback mMyCallback;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private LiveMusicListAdapter adapter;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            iArr[Status.ERROR.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SortCollectionActivity() {
        final Function0<ViewModelOwner> function0 = new Function0<ViewModelOwner>() { // from class: com.huami.sleepassistant.lib.ui.temperament.sort.SortCollectionActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final ViewModelOwner getA() {
                ViewModelOwner.Companion companion = ViewModelOwner.INSTANCE;
                ComponentCallbacks componentCallbacks = this;
                return companion.from((ViewModelStoreOwner) componentCallbacks, componentCallbacks instanceof SavedStateRegistryOwner ? (SavedStateRegistryOwner) componentCallbacks : null);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.viewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<SortCollectionViewModel>() { // from class: com.huami.sleepassistant.lib.ui.temperament.sort.SortCollectionActivity$special$$inlined$viewModel$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.ViewModel, com.huami.sleepassistant.lib.ui.temperament.sort.SortCollectionViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final SortCollectionViewModel getA() {
                return ComponentCallbackExtKt.getViewModel(this, qualifier, Reflection.getOrCreateKotlinClass(SortCollectionViewModel.class), function0, objArr);
            }
        });
    }

    private final SortCollectionViewModel o() {
        return (SortCollectionViewModel) this.viewModel.getValue();
    }

    private final void p() {
        ((ImageView) findViewById(R.id.sls_back)).setOnClickListener(new View.OnClickListener() { // from class: k67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SortCollectionActivity.q(this.a, view);
            }
        });
        ((TypefaceTextView) findViewById(R.id.sls_collection_sort_over)).setOnClickListener(new View.OnClickListener() { // from class: j67
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SortCollectionActivity.r(this.a, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(SortCollectionActivity sortCollectionActivity, View view) {
        sortCollectionActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(SortCollectionActivity sortCollectionActivity, View view) {
        ArrayList<String> arrayList;
        List<LiveMusicVo> list = sortCollectionActivity.list;
        if (list == null) {
            arrayList = null;
        } else {
            ArrayList<String> arrayList2 = new ArrayList<>(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((LiveMusicVo) it2.next()).getSid());
            }
            arrayList = arrayList2;
        }
        PostLiveMusicSortBean postLiveMusicSortBean = new PostLiveMusicSortBean();
        Objects.requireNonNull(arrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
        postLiveMusicSortBean.setIds(arrayList);
        postLiveMusicSortBean.setList(sortCollectionActivity.list);
        sortCollectionActivity.o().setSortCollection(postLiveMusicSortBean);
    }

    private final void s() {
        o().getSortCollectionResult().observe(this, new Observer() { // from class: l67
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                SortCollectionActivity.t(this.a, (Resource) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(SortCollectionActivity sortCollectionActivity, Resource resource) {
        if (resource != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i == 2) {
                sortCollectionActivity.finish();
                CustomToast.makeText(sortCollectionActivity, sortCollectionActivity.getString(R.string.sls_change_sort_collection_success), 0).show();
            } else {
                if (i != 3) {
                    return;
                }
                CustomToast.makeText(sortCollectionActivity, sortCollectionActivity.getString(R.string.sls_sort_collection_error), 0).show();
            }
        }
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sls_activity_sort_collection);
        setStyle(BaseTitleActivity.STYLE.NONE);
        try {
            String stringExtra = getIntent().getStringExtra("KEY");
            Json nonStrictInstance = SerializationKtxKt.getNonStrictInstance(Json.INSTANCE);
            KSerializer kSerializerListSerializer = BuiltinSerializersKt.ListSerializer(LiveMusicVo.INSTANCE.serializer());
            if (stringExtra == null) {
                stringExtra = "";
            }
            List<LiveMusicVo> list = (List) nonStrictInstance.decodeFromString(kSerializerListSerializer, stringExtra);
            this.list = list;
            if (list == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.MutableList<com.huami.sleepassistant.apilib.vo.LiveMusicVo>");
            }
            this.adapter = new LiveMusicListAdapter(TypeIntrinsics.asMutableList(list));
            MyCallback myCallback = new MyCallback(this.adapter, this.list);
            this.mMyCallback = myCallback;
            ItemTouchHelper itemTouchHelper = new ItemTouchHelper(myCallback);
            int i = R.id.sls_sort_music_recycler;
            itemTouchHelper.attachToRecyclerView((RecyclerView) findViewById(i));
            RecyclerView recyclerView = (RecyclerView) findViewById(i);
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.adapter);
            recyclerView.setItemAnimator(null);
            p();
            s();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
