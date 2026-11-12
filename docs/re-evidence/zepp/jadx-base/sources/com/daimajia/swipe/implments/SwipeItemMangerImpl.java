package com.daimajia.swipe.implments;

import android.view.View;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.daimajia.swipe.SimpleSwipeListener;
import com.daimajia.swipe.SwipeLayout;
import com.daimajia.swipe.interfaces.SwipeAdapterInterface;
import com.daimajia.swipe.interfaces.SwipeItemMangerInterface;
import com.daimajia.swipe.util.Attributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SwipeItemMangerImpl implements SwipeItemMangerInterface {
    public BaseAdapter mBaseAdapter;
    public RecyclerView.Adapter mRecyclerAdapter;
    private Attributes.Mode a = Attributes.Mode.Single;
    public final int INVALID_POSITION = -1;
    public int mOpenPosition = -1;
    public Set<Integer> mOpenPositions = new HashSet();
    public Set<SwipeLayout> mShownLayouts = new HashSet();

    public class a implements SwipeLayout.OnLayout {
        private int a;

        public a(int i) {
            this.a = i;
        }

        public void a(int i) {
            this.a = i;
        }

        @Override // com.daimajia.swipe.SwipeLayout.OnLayout
        public void onLayout(SwipeLayout swipeLayout) {
            if (SwipeItemMangerImpl.this.isOpen(this.a)) {
                swipeLayout.open(false, false);
            } else {
                swipeLayout.close(false, false);
            }
        }
    }

    public class b extends SimpleSwipeListener {
        private int a;

        public b(int i) {
            this.a = i;
        }

        public void a(int i) {
            this.a = i;
        }

        @Override // com.daimajia.swipe.SimpleSwipeListener, com.daimajia.swipe.SwipeLayout.SwipeListener
        public void onClose(SwipeLayout swipeLayout) {
            if (SwipeItemMangerImpl.this.a == Attributes.Mode.Multiple) {
                SwipeItemMangerImpl.this.mOpenPositions.remove(Integer.valueOf(this.a));
            } else {
                SwipeItemMangerImpl.this.mOpenPosition = -1;
            }
        }

        @Override // com.daimajia.swipe.SimpleSwipeListener, com.daimajia.swipe.SwipeLayout.SwipeListener
        public void onOpen(SwipeLayout swipeLayout) {
            if (SwipeItemMangerImpl.this.a == Attributes.Mode.Multiple) {
                SwipeItemMangerImpl.this.mOpenPositions.add(Integer.valueOf(this.a));
                return;
            }
            SwipeItemMangerImpl.this.closeAllExcept(swipeLayout);
            SwipeItemMangerImpl.this.mOpenPosition = this.a;
        }

        @Override // com.daimajia.swipe.SimpleSwipeListener, com.daimajia.swipe.SwipeLayout.SwipeListener
        public void onStartOpen(SwipeLayout swipeLayout) {
            if (SwipeItemMangerImpl.this.a == Attributes.Mode.Single) {
                SwipeItemMangerImpl.this.closeAllExcept(swipeLayout);
            }
        }
    }

    public class c {
        public a a;
        public b b;
        public int c;

        public c(int i, b bVar, a aVar) {
            this.b = bVar;
            this.a = aVar;
            this.c = i;
        }
    }

    public SwipeItemMangerImpl(BaseAdapter baseAdapter) {
        if (baseAdapter == null) {
            throw new IllegalArgumentException("Adapter can not be null");
        }
        if (!(baseAdapter instanceof SwipeItemMangerInterface)) {
            throw new IllegalArgumentException("adapter should implement the SwipeAdapterInterface");
        }
        this.mBaseAdapter = baseAdapter;
    }

    public abstract void bindView(View view, int i);

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public void closeAllExcept(SwipeLayout swipeLayout) {
        for (SwipeLayout swipeLayout2 : this.mShownLayouts) {
            if (swipeLayout2 != swipeLayout) {
                swipeLayout2.close();
            }
        }
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public void closeAllItems() {
        if (this.a == Attributes.Mode.Multiple) {
            this.mOpenPositions.clear();
        } else {
            this.mOpenPosition = -1;
        }
        Iterator<SwipeLayout> it2 = this.mShownLayouts.iterator();
        while (it2.hasNext()) {
            it2.next().close();
        }
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public void closeItem(int i) {
        if (this.a == Attributes.Mode.Multiple) {
            this.mOpenPositions.remove(Integer.valueOf(i));
        } else if (this.mOpenPosition == i) {
            this.mOpenPosition = -1;
        }
        BaseAdapter baseAdapter = this.mBaseAdapter;
        if (baseAdapter != null) {
            baseAdapter.notifyDataSetChanged();
            return;
        }
        RecyclerView.Adapter adapter = this.mRecyclerAdapter;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public Attributes.Mode getMode() {
        return this.a;
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public List<Integer> getOpenItems() {
        return this.a == Attributes.Mode.Multiple ? new ArrayList(this.mOpenPositions) : Arrays.asList(Integer.valueOf(this.mOpenPosition));
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public List<SwipeLayout> getOpenLayouts() {
        return new ArrayList(this.mShownLayouts);
    }

    public int getSwipeLayoutId(int i) {
        SpinnerAdapter spinnerAdapter = this.mBaseAdapter;
        if (spinnerAdapter != null) {
            return ((SwipeAdapterInterface) spinnerAdapter).getSwipeLayoutResourceId(i);
        }
        Object obj = this.mRecyclerAdapter;
        if (obj != null) {
            return ((SwipeAdapterInterface) obj).getSwipeLayoutResourceId(i);
        }
        return -1;
    }

    public abstract void initialize(View view, int i);

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public boolean isOpen(int i) {
        if (this.a == Attributes.Mode.Multiple) {
            return this.mOpenPositions.contains(Integer.valueOf(i));
        }
        return this.mOpenPosition == i;
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public void openItem(int i) {
        if (this.a != Attributes.Mode.Multiple) {
            this.mOpenPosition = i;
        } else if (!this.mOpenPositions.contains(Integer.valueOf(i))) {
            this.mOpenPositions.add(Integer.valueOf(i));
        }
        BaseAdapter baseAdapter = this.mBaseAdapter;
        if (baseAdapter != null) {
            baseAdapter.notifyDataSetChanged();
            return;
        }
        RecyclerView.Adapter adapter = this.mRecyclerAdapter;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public void removeShownLayouts(SwipeLayout swipeLayout) {
        this.mShownLayouts.remove(swipeLayout);
    }

    @Override // com.daimajia.swipe.interfaces.SwipeItemMangerInterface
    public void setMode(Attributes.Mode mode) {
        this.a = mode;
        this.mOpenPositions.clear();
        this.mShownLayouts.clear();
        this.mOpenPosition = -1;
    }

    public abstract void updateConvertView(View view, int i);

    public SwipeItemMangerImpl(RecyclerView.Adapter adapter) {
        if (adapter != null) {
            if (adapter instanceof SwipeItemMangerInterface) {
                this.mRecyclerAdapter = adapter;
                return;
            }
            throw new IllegalArgumentException("adapter should implement the SwipeAdapterInterface");
        }
        throw new IllegalArgumentException("Adapter can not be null");
    }
}
