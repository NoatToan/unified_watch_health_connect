package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresOptIn;
import androidx.collection.ArraySet;
import androidx.collection.LongSparseArray;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.cdo;
import defpackage.g6i;
import defpackage.uma;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentStateAdapter extends RecyclerView.Adapter<uma> implements cdo {
    private static final long GRACE_WINDOW_TIME_MS = 10000;
    private static final String KEY_PREFIX_FRAGMENT = "f#";
    private static final String KEY_PREFIX_STATE = "s#";
    e mFragmentEventDispatcher;
    final FragmentManager mFragmentManager;
    private FragmentMaxLifecycleEnforcer mFragmentMaxLifecycleEnforcer;
    final LongSparseArray<Fragment> mFragments;
    private boolean mHasStaleFragments;
    boolean mIsInGracePeriod;
    private final LongSparseArray<Integer> mItemIdToViewHolder;
    final Lifecycle mLifecycle;
    private final LongSparseArray<Fragment.SavedState> mSavedStates;

    public class FragmentMaxLifecycleEnforcer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ViewPager2.i f3138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView.i f3139b;
        public LifecycleEventObserver c;
        public ViewPager2 d;
        public long e = -1;

        public class a extends ViewPager2.i {
            public a() {
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageScrollStateChanged(int i) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.i
            public void onPageSelected(int i) {
                FragmentMaxLifecycleEnforcer.this.d(false);
            }
        }

        public class b extends c {
            public b() {
                super();
            }

            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.c, androidx.recyclerview.widget.RecyclerView.i
            public void onChanged() {
                FragmentMaxLifecycleEnforcer.this.d(true);
            }
        }

        public FragmentMaxLifecycleEnforcer() {
        }

        public final ViewPager2 a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        public void b(RecyclerView recyclerView) {
            this.d = a(recyclerView);
            a aVar = new a();
            this.f3138a = aVar;
            this.d.h(aVar);
            b bVar = new b();
            this.f3139b = bVar;
            FragmentStateAdapter.this.registerAdapterDataObserver(bVar);
            LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.FragmentMaxLifecycleEnforcer.3
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    FragmentMaxLifecycleEnforcer.this.d(false);
                }
            };
            this.c = lifecycleEventObserver;
            FragmentStateAdapter.this.mLifecycle.addObserver(lifecycleEventObserver);
        }

        public void c(RecyclerView recyclerView) {
            a(recyclerView).o(this.f3138a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f3139b);
            FragmentStateAdapter.this.mLifecycle.removeObserver(this.c);
            this.d = null;
        }

        public void d(boolean z) {
            int currentItem;
            Fragment fragment;
            if (FragmentStateAdapter.this.shouldDelayFragmentTransactions() || this.d.getScrollState() != 0 || FragmentStateAdapter.this.mFragments.isEmpty() || FragmentStateAdapter.this.getItemCount() == 0 || (currentItem = this.d.getCurrentItem()) >= FragmentStateAdapter.this.getItemCount()) {
                return;
            }
            long itemId = FragmentStateAdapter.this.getItemId(currentItem);
            if ((itemId != this.e || z) && (fragment = FragmentStateAdapter.this.mFragments.get(itemId)) != null && fragment.isAdded()) {
                this.e = itemId;
                k kVarO = FragmentStateAdapter.this.mFragmentManager.o();
                ArrayList arrayList = new ArrayList();
                Fragment fragment2 = null;
                for (int i = 0; i < FragmentStateAdapter.this.mFragments.size(); i++) {
                    long jKeyAt = FragmentStateAdapter.this.mFragments.keyAt(i);
                    Fragment fragmentValueAt = FragmentStateAdapter.this.mFragments.valueAt(i);
                    if (fragmentValueAt.isAdded()) {
                        if (jKeyAt != this.e) {
                            Lifecycle.State state = Lifecycle.State.STARTED;
                            kVarO.B(fragmentValueAt, state);
                            arrayList.add(FragmentStateAdapter.this.mFragmentEventDispatcher.a(fragmentValueAt, state));
                        } else {
                            fragment2 = fragmentValueAt;
                        }
                        fragmentValueAt.setMenuVisibility(jKeyAt == this.e);
                    }
                }
                if (fragment2 != null) {
                    Lifecycle.State state2 = Lifecycle.State.RESUMED;
                    kVarO.B(fragment2, state2);
                    arrayList.add(FragmentStateAdapter.this.mFragmentEventDispatcher.a(fragment2, state2));
                }
                if (kVarO.u()) {
                    return;
                }
                kVarO.n();
                Collections.reverse(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    FragmentStateAdapter.this.mFragmentEventDispatcher.b((List) it.next());
                }
            }
        }
    }

    public class a extends FragmentManager.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f3143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f3144b;

        public a(Fragment fragment, FrameLayout frameLayout) {
            this.f3143a = fragment;
            this.f3144b = frameLayout;
        }

        @Override // androidx.fragment.app.FragmentManager.l
        public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f3143a) {
                fragmentManager.I1(this);
                FragmentStateAdapter.this.addViewToContainer(view, this.f3144b);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.mIsInGracePeriod = false;
            fragmentStateAdapter.gcFragments();
        }
    }

    public static abstract class c extends RecyclerView.i {
        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public abstract void onChanged();

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeInserted(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeMoved(int i, int i2, int i3) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeRemoved(int i, int i2) {
            onChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public final void onItemRangeChanged(int i, int i2, Object obj) {
            onChanged();
        }
    }

    @RequiresOptIn(level = RequiresOptIn.Level.WARNING)
    public @interface d {
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List<f> f3146a = new CopyOnWriteArrayList();

        public List<f.b> a(Fragment fragment, Lifecycle.State state) {
            ArrayList arrayList = new ArrayList();
            Iterator<f> it = this.f3146a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().a(fragment, state));
            }
            return arrayList;
        }

        public void b(List<f.b> list) {
            Iterator<f.b> it = list.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }

        public List<f.b> c(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<f> it = this.f3146a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().b(fragment));
            }
            return arrayList;
        }

        public List<f.b> d(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<f> it = this.f3146a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().c(fragment));
            }
            return arrayList;
        }

        @OptIn(markerClass = {d.class})
        public List<f.b> e(Fragment fragment) {
            ArrayList arrayList = new ArrayList();
            Iterator<f> it = this.f3146a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().d(fragment));
            }
            return arrayList;
        }

        public void f(f fVar) {
            this.f3146a.add(fVar);
        }

        public void g(f fVar) {
            this.f3146a.remove(fVar);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f3147a = new a();

        public class a implements b {
            @Override // androidx.viewpager2.adapter.FragmentStateAdapter.f.b
            public void a() {
            }
        }

        public interface b {
            void a();
        }

        public b a(Fragment fragment, Lifecycle.State state) {
            return f3147a;
        }

        public b b(Fragment fragment) {
            return f3147a;
        }

        public b c(Fragment fragment) {
            return f3147a;
        }

        @d
        public b d(Fragment fragment) {
            return f3147a;
        }
    }

    public FragmentStateAdapter(FragmentActivity fragmentActivity) {
        this(fragmentActivity.getSupportFragmentManager(), fragmentActivity.getLifecycle());
    }

    private static String createKey(String str, long j) {
        return str + j;
    }

    private void ensureFragment(int i) {
        long itemId = getItemId(i);
        if (this.mFragments.containsKey(itemId)) {
            return;
        }
        Fragment fragmentCreateFragment = createFragment(i);
        fragmentCreateFragment.setInitialSavedState(this.mSavedStates.get(itemId));
        this.mFragments.put(itemId, fragmentCreateFragment);
    }

    private boolean isFragmentViewBound(long j) {
        View view;
        if (this.mItemIdToViewHolder.containsKey(j)) {
            return true;
        }
        Fragment fragment = this.mFragments.get(j);
        return (fragment == null || (view = fragment.getView()) == null || view.getParent() == null) ? false : true;
    }

    private static boolean isValidKey(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    private Long itemForViewHolder(int i) {
        Long lValueOf = null;
        for (int i2 = 0; i2 < this.mItemIdToViewHolder.size(); i2++) {
            if (this.mItemIdToViewHolder.valueAt(i2).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(this.mItemIdToViewHolder.keyAt(i2));
            }
        }
        return lValueOf;
    }

    private static long parseIdFromKey(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private void removeFragment(long j) {
        ViewParent parent;
        Fragment fragment = this.mFragments.get(j);
        if (fragment == null) {
            return;
        }
        if (fragment.getView() != null && (parent = fragment.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!containsItem(j)) {
            this.mSavedStates.remove(j);
        }
        if (!fragment.isAdded()) {
            this.mFragments.remove(j);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            this.mHasStaleFragments = true;
            return;
        }
        if (fragment.isAdded() && containsItem(j)) {
            List<f.b> listE = this.mFragmentEventDispatcher.e(fragment);
            Fragment.SavedState savedStateX1 = this.mFragmentManager.x1(fragment);
            this.mFragmentEventDispatcher.b(listE);
            this.mSavedStates.put(j, savedStateX1);
        }
        List<f.b> listD = this.mFragmentEventDispatcher.d(fragment);
        try {
            this.mFragmentManager.o().v(fragment).n();
            this.mFragments.remove(j);
        } finally {
            this.mFragmentEventDispatcher.b(listD);
        }
    }

    private void scheduleGracePeriodEnd() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final b bVar = new b();
        this.mLifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.4
            @Override // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    handler.removeCallbacks(bVar);
                    lifecycleOwner.getLifecycle().removeObserver(this);
                }
            }
        });
        handler.postDelayed(bVar, 10000L);
    }

    private void scheduleViewAttach(Fragment fragment, FrameLayout frameLayout) {
        this.mFragmentManager.p1(new a(fragment, frameLayout), false);
    }

    public void addViewToContainer(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public boolean containsItem(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    public abstract Fragment createFragment(int i);

    public void gcFragments() {
        if (!this.mHasStaleFragments || shouldDelayFragmentTransactions()) {
            return;
        }
        ArraySet arraySet = new ArraySet();
        for (int i = 0; i < this.mFragments.size(); i++) {
            long jKeyAt = this.mFragments.keyAt(i);
            if (!containsItem(jKeyAt)) {
                arraySet.add(Long.valueOf(jKeyAt));
                this.mItemIdToViewHolder.remove(jKeyAt);
            }
        }
        if (!this.mIsInGracePeriod) {
            this.mHasStaleFragments = false;
            for (int i2 = 0; i2 < this.mFragments.size(); i2++) {
                long jKeyAt2 = this.mFragments.keyAt(i2);
                if (!isFragmentViewBound(jKeyAt2)) {
                    arraySet.add(Long.valueOf(jKeyAt2));
                }
            }
        }
        Iterator<E> it = arraySet.iterator();
        while (it.hasNext()) {
            removeFragment(((Long) it.next()).longValue());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        g6i.a(this.mFragmentMaxLifecycleEnforcer == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.mFragmentMaxLifecycleEnforcer = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.b(recyclerView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.mFragmentMaxLifecycleEnforcer.c(recyclerView);
        this.mFragmentMaxLifecycleEnforcer = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final boolean onFailedToRecycleView(uma umaVar) {
        return true;
    }

    public void placeFragmentInViewHolder(final uma umaVar) {
        Fragment fragment = this.mFragments.get(umaVar.getItemId());
        if (fragment == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout container = umaVar.getContainer();
        View view = fragment.getView();
        if (!fragment.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (fragment.isAdded() && view == null) {
            scheduleViewAttach(fragment, container);
            return;
        }
        if (fragment.isAdded() && view.getParent() != null) {
            if (view.getParent() != container) {
                addViewToContainer(view, container);
                return;
            }
            return;
        }
        if (fragment.isAdded()) {
            addViewToContainer(view, container);
            return;
        }
        if (shouldDelayFragmentTransactions()) {
            if (this.mFragmentManager.L0()) {
                return;
            }
            this.mLifecycle.addObserver(new LifecycleEventObserver() { // from class: androidx.viewpager2.adapter.FragmentStateAdapter.1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (FragmentStateAdapter.this.shouldDelayFragmentTransactions()) {
                        return;
                    }
                    lifecycleOwner.getLifecycle().removeObserver(this);
                    if (umaVar.getContainer().isAttachedToWindow()) {
                        FragmentStateAdapter.this.placeFragmentInViewHolder(umaVar);
                    }
                }
            });
            return;
        }
        scheduleViewAttach(fragment, container);
        List<f.b> listC = this.mFragmentEventDispatcher.c(fragment);
        try {
            fragment.setMenuVisibility(false);
            this.mFragmentManager.o().f(fragment, PluginDeviceInfo.FBLUETOOTHPAIR + umaVar.getItemId()).B(fragment, Lifecycle.State.STARTED).n();
            this.mFragmentMaxLifecycleEnforcer.d(false);
        } finally {
            this.mFragmentEventDispatcher.b(listC);
        }
    }

    public void registerFragmentTransactionCallback(f fVar) {
        this.mFragmentEventDispatcher.f(fVar);
    }

    @Override // defpackage.cdo
    public final void restoreState(Parcelable parcelable) {
        if (!this.mSavedStates.isEmpty() || !this.mFragments.isEmpty()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (isValidKey(str, KEY_PREFIX_FRAGMENT)) {
                this.mFragments.put(parseIdFromKey(str, KEY_PREFIX_FRAGMENT), this.mFragmentManager.v0(bundle, str));
            } else {
                if (!isValidKey(str, KEY_PREFIX_STATE)) {
                    throw new IllegalArgumentException("Unexpected key in savedState: " + str);
                }
                long idFromKey = parseIdFromKey(str, KEY_PREFIX_STATE);
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (containsItem(idFromKey)) {
                    this.mSavedStates.put(idFromKey, savedState);
                }
            }
        }
        if (this.mFragments.isEmpty()) {
            return;
        }
        this.mHasStaleFragments = true;
        this.mIsInGracePeriod = true;
        gcFragments();
        scheduleGracePeriodEnd();
    }

    @Override // defpackage.cdo
    public final Parcelable saveState() {
        Bundle bundle = new Bundle(this.mFragments.size() + this.mSavedStates.size());
        for (int i = 0; i < this.mFragments.size(); i++) {
            long jKeyAt = this.mFragments.keyAt(i);
            Fragment fragment = this.mFragments.get(jKeyAt);
            if (fragment != null && fragment.isAdded()) {
                this.mFragmentManager.o1(bundle, createKey(KEY_PREFIX_FRAGMENT, jKeyAt), fragment);
            }
        }
        for (int i2 = 0; i2 < this.mSavedStates.size(); i2++) {
            long jKeyAt2 = this.mSavedStates.keyAt(i2);
            if (containsItem(jKeyAt2)) {
                bundle.putParcelable(createKey(KEY_PREFIX_STATE, jKeyAt2), this.mSavedStates.get(jKeyAt2));
            }
        }
        return bundle;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    public boolean shouldDelayFragmentTransactions() {
        return this.mFragmentManager.T0();
    }

    public void unregisterFragmentTransactionCallback(f fVar) {
        this.mFragmentEventDispatcher.g(fVar);
    }

    public FragmentStateAdapter(Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(uma umaVar, int i) {
        long itemId = umaVar.getItemId();
        int id = umaVar.getContainer().getId();
        Long lItemForViewHolder = itemForViewHolder(id);
        if (lItemForViewHolder != null && lItemForViewHolder.longValue() != itemId) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.remove(lItemForViewHolder.longValue());
        }
        this.mItemIdToViewHolder.put(itemId, Integer.valueOf(id));
        ensureFragment(i);
        if (umaVar.getContainer().isAttachedToWindow()) {
            placeFragmentInViewHolder(umaVar);
        }
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final uma onCreateViewHolder(ViewGroup viewGroup, int i) {
        return uma.a(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewAttachedToWindow(uma umaVar) {
        placeFragmentInViewHolder(umaVar);
        gcFragments();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(uma umaVar) {
        Long lItemForViewHolder = itemForViewHolder(umaVar.getContainer().getId());
        if (lItemForViewHolder != null) {
            removeFragment(lItemForViewHolder.longValue());
            this.mItemIdToViewHolder.remove(lItemForViewHolder.longValue());
        }
    }

    public FragmentStateAdapter(FragmentManager fragmentManager, Lifecycle lifecycle) {
        this.mFragments = new LongSparseArray<>();
        this.mSavedStates = new LongSparseArray<>();
        this.mItemIdToViewHolder = new LongSparseArray<>();
        this.mFragmentEventDispatcher = new e();
        this.mIsInGracePeriod = false;
        this.mHasStaleFragments = false;
        this.mFragmentManager = fragmentManager;
        this.mLifecycle = lifecycle;
        super.setHasStableIds(true);
    }
}
