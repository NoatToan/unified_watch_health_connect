package com.xiaomi.fitness.route.track.view;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.xiaomi.fitness.baseui.view.IActionBar;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.route.track.TrackListFragmentOperator;
import com.xiaomi.fitness.route.track.view.MyTrackLibraryActivity;
import com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM;
import defpackage.ayk;
import defpackage.bvi;
import defpackage.doi;
import defpackage.wc0;
import defpackage.x0j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000K\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u000b*\u0001)\b\u0007\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012B\u0007¢\u0006\u0004\b1\u0010\u001cJ!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010%\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010'\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010-¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/route/track/view/MyTrackLibraryActivity;", "Lcom/xiaomi/fitness/baseui/view/BaseBindingActivity;", "Lcom/xiaomi/fitness/route/track/viewmodel/MyTrackLibraryVM;", "Layk;", "Landroid/content/Intent;", "intent", "", "fromNewIntent", "", "handleIntent", "(Landroid/content/Intent;Z)V", "", "position", "onTabSelect", "(I)V", "drawableId", "initStartView", "(ILjava/lang/Integer;)V", "contentDescription", "initEndView", "(ILjava/lang/Integer;Ljava/lang/Integer;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onNewIntent", "(Landroid/content/Intent;)V", LifecycleConstantKt.ON_DESTROY, "()V", "Lcom/xiaomi/fitness/route/track/view/TrackListFragmentAdapter;", "fragmentAdapter", "Lcom/xiaomi/fitness/route/track/view/TrackListFragmentAdapter;", "getFragmentAdapter", "()Lcom/xiaomi/fitness/route/track/view/TrackListFragmentAdapter;", "setFragmentAdapter", "(Lcom/xiaomi/fitness/route/track/view/TrackListFragmentAdapter;)V", "Lcom/xiaomi/fitness/route/track/view/TrackListTabAdapter;", "tabAdapter", "Lcom/xiaomi/fitness/route/track/view/TrackListTabAdapter;", "currentPosition", "I", "com/xiaomi/fitness/route/track/view/MyTrackLibraryActivity$onPageChangeCallback$1", "onPageChangeCallback", "Lcom/xiaomi/fitness/route/track/view/MyTrackLibraryActivity$onPageChangeCallback$1;", "getLayoutId", "()I", "layoutId", "getViewModelId", "viewModelId", "<init>", "Companion", "route_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MyTrackLibraryActivity extends Hilt_MyTrackLibraryActivity<MyTrackLibraryVM, ayk> {

    @NotNull
    public static final String ROUTE_IDS = "route_ids";

    @NotNull
    public static final String isFromDeviceLib = "isFromDeviceLib";
    private int currentPosition;

    @Nullable
    private TrackListFragmentAdapter fragmentAdapter;

    @NotNull
    private final MyTrackLibraryActivity$onPageChangeCallback$1 onPageChangeCallback = new ViewPager2.i() { // from class: com.xiaomi.fitness.route.track.view.MyTrackLibraryActivity$onPageChangeCallback$1
        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void onPageSelected(int position) {
            TrackListFragmentOperator fragment;
            super.onPageSelected(position);
            this.this$0.currentPosition = position;
            TrackListTabAdapter trackListTabAdapter = this.this$0.tabAdapter;
            if (trackListTabAdapter != null) {
                trackListTabAdapter.setSelect(position);
            }
            MyTrackLibraryActivity.initStartView$default(this.this$0, position, null, 2, null);
            MyTrackLibraryActivity.initEndView$default(this.this$0, position, null, null, 6, null);
            TrackListFragmentAdapter fragmentAdapter = this.this$0.getFragmentAdapter();
            if (fragmentAdapter == null || (fragment = fragmentAdapter.getFragment(position)) == null) {
                return;
            }
            fragment.requestEndView();
        }
    };

    @Nullable
    private TrackListTabAdapter tabAdapter;

    /* JADX INFO: renamed from: com.xiaomi.fitness.route.track.view.MyTrackLibraryActivity$onCreate$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
        public AnonymousClass1(Object obj) {
            super(1, obj, MyTrackLibraryActivity.class, "onTabSelect", "onTabSelect(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(int i) {
            ((MyTrackLibraryActivity) this.receiver).onTabSelect(i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0040  */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0048  */
    /* JADX WARN: Multi-variable type inference failed */
    private final void handleIntent(Intent intent, boolean fromNewIntent) {
        boolean z;
        TrackListFragmentOperator fragment;
        this.fragmentAdapter = new TrackListFragmentAdapter(intent, this);
        ((ayk) getMBinding()).B.setAdapter(this.fragmentAdapter);
        boolean booleanExtra = intent != null ? intent.getBooleanExtra(isFromDeviceLib, false) : false;
        if (!Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.intent.action.SEND")) {
            if (!Intrinsics.areEqual(intent != null ? intent.getAction() : null, "android.intent.action.VIEW")) {
                z = false;
            } else if (intent.getType() != null) {
                z = true;
            } else {
                z = false;
            }
        } else if (intent.getType() != null) {
            z = true;
        } else {
            z = false;
        }
        int i = (booleanExtra || z || fromNewIntent) ? 2 : 0;
        ((ayk) getMBinding()).B.setCurrentItem(i);
        TrackListTabAdapter trackListTabAdapter = this.tabAdapter;
        if (trackListTabAdapter != null) {
            trackListTabAdapter.setDataList(i);
        }
        initStartView$default(this, i, null, 2, null);
        initEndView$default(this, i, null, null, 6, null);
        TrackListFragmentAdapter trackListFragmentAdapter = this.fragmentAdapter;
        if (trackListFragmentAdapter == null || (fragment = trackListFragmentAdapter.getFragment(i)) == null) {
            return;
        }
        fragment.requestEndView();
    }

    private final void initEndView(final int position, Integer drawableId, Integer contentDescription) {
        TrackListFragmentOperator fragment;
        TextView textView = new TextView(this);
        textView.setContentDescription(getString(contentDescription != null ? contentDescription.intValue() : x0j.n));
        if (drawableId != null) {
            textView.setBackgroundResource(drawableId.intValue());
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: cfg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyTrackLibraryActivity.initEndView$lambda$3(this.f5280a, position, view);
            }
        });
        wc0 miuiActionBar = getMiuiActionBar();
        if (miuiActionBar != null) {
            miuiActionBar.setEndView(textView);
        }
        TrackListFragmentAdapter trackListFragmentAdapter = this.fragmentAdapter;
        if (trackListFragmentAdapter == null || (fragment = trackListFragmentAdapter.getFragment(position)) == null) {
            return;
        }
        fragment.setEndViewRefreshListener(new Function3() { // from class: dfg
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return MyTrackLibraryActivity.initEndView$lambda$4(this.f15481a, position, (View) obj, (Integer) obj2, (Integer) obj3);
            }
        });
    }

    public static /* synthetic */ void initEndView$default(MyTrackLibraryActivity myTrackLibraryActivity, int i, Integer num, Integer num2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        if ((i2 & 4) != 0) {
            num2 = Integer.valueOf(x0j.n);
        }
        myTrackLibraryActivity.initEndView(i, num, num2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initEndView$lambda$3(MyTrackLibraryActivity this$0, int i, View view) {
        TrackListFragmentOperator fragment;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TrackListFragmentAdapter trackListFragmentAdapter = this$0.fragmentAdapter;
        if (trackListFragmentAdapter == null || (fragment = trackListFragmentAdapter.getFragment(i)) == null) {
            return;
        }
        fragment.onEndViewClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initEndView$lambda$4(MyTrackLibraryActivity this$0, int i, View view, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.initEndView(i, num, num2);
        return Unit.INSTANCE;
    }

    private final void initStartView(final int position, Integer drawableId) {
        TrackListFragmentOperator fragment;
        IActionBar.DefaultImpls.setStartView$default(this, 0, drawableId != null ? drawableId.intValue() : doi.f15744k, getString(x0j.Z), new View.OnClickListener() { // from class: efg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MyTrackLibraryActivity.initStartView$lambda$1(this.f16590a, position, view);
            }
        }, 1, null);
        TrackListFragmentAdapter trackListFragmentAdapter = this.fragmentAdapter;
        if (trackListFragmentAdapter == null || (fragment = trackListFragmentAdapter.getFragment(position)) == null) {
            return;
        }
        fragment.setStartViewRefreshListener(new Function2() { // from class: ffg
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MyTrackLibraryActivity.initStartView$lambda$2(this.f17737a, position, (View) obj, ((Integer) obj2).intValue());
            }
        });
    }

    public static /* synthetic */ void initStartView$default(MyTrackLibraryActivity myTrackLibraryActivity, int i, Integer num, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        myTrackLibraryActivity.initStartView(i, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initStartView$lambda$1(MyTrackLibraryActivity this$0, int i, View view) {
        TrackListFragmentOperator fragment;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TrackListFragmentAdapter trackListFragmentAdapter = this$0.fragmentAdapter;
        if (trackListFragmentAdapter == null || (fragment = trackListFragmentAdapter.getFragment(i)) == null) {
            return;
        }
        fragment.onStartViewClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initStartView$lambda$2(MyTrackLibraryActivity this$0, int i, View view, int i2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view != null) {
            this$0.setStartView(view);
            return Unit.INSTANCE;
        }
        this$0.initStartView(i, Integer.valueOf(i2));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void onTabSelect(int position) {
        ((ayk) getMBinding()).B.setCurrentItem(position);
        this.currentPosition = position;
    }

    @Nullable
    public final TrackListFragmentAdapter getFragmentAdapter() {
        return this.fragmentAdapter;
    }

    @Override // com.xiaomi.fitness.baseui.ViewCreator
    public int getLayoutId() {
        return bvi.n;
    }

    @Override // com.xiaomi.fitness.baseui.view.BaseBindingActivity
    public int getViewModelId() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.route.track.view.Hilt_MyTrackLibraryActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hideBack();
        setTitle(x0j.w);
        setActionBarNormalTitleMode();
        ((ayk) getMBinding()).B.setOrientation(0);
        this.tabAdapter = new TrackListTabAdapter(new AnonymousClass1(this));
        ((ayk) getMBinding()).A.setAdapter(this.tabAdapter);
        RecyclerView recyclerView = ((ayk) getMBinding()).A;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this);
        flexboxLayoutManager.U(4);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        ((ayk) getMBinding()).B.h(this.onPageChangeCallback);
        handleIntent(getIntent(), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.route.track.view.Hilt_MyTrackLibraryActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((ayk) getMBinding()).B.o(this.onPageChangeCallback);
    }

    @Override // androidx.p004activity.ComponentActivity, android.app.Activity
    public void onNewIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        handleIntent(intent, true);
    }

    public final void setFragmentAdapter(@Nullable TrackListFragmentAdapter trackListFragmentAdapter) {
        this.fragmentAdapter = trackListFragmentAdapter;
    }
}
