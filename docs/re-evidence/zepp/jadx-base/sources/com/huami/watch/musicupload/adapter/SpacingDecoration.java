package com.huami.watch.musicupload.adapter;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* JADX INFO: loaded from: classes16.dex */
public class SpacingDecoration extends RecyclerView.ItemDecoration {
    private int a;
    private int b;
    private boolean c;

    public SpacingDecoration(int i, int i2, boolean z) {
        this.a = 0;
        this.b = 0;
        this.c = false;
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    private void a(Rect rect, View view, RecyclerView recyclerView) {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int spanCount = gridLayoutManager.getSpanCount();
        int i = childAdapterPosition % spanCount;
        if (gridLayoutManager.getOrientation() == 1) {
            if (this.c) {
                int i2 = this.a;
                rect.left = ((spanCount - i) * i2) / spanCount;
                rect.right = (i2 * (i + 1)) / spanCount;
                if (gridLayoutManager.getReverseLayout()) {
                    if (childAdapterPosition < spanCount) {
                        rect.bottom = this.b;
                    }
                    rect.top = this.b;
                    return;
                } else {
                    if (childAdapterPosition < spanCount) {
                        rect.top = this.b;
                    }
                    rect.bottom = this.b;
                    return;
                }
            }
            int i3 = this.a;
            rect.left = (i3 * i) / spanCount;
            rect.right = (i3 * ((spanCount - 1) - i)) / spanCount;
            if (gridLayoutManager.getReverseLayout()) {
                if (childAdapterPosition >= spanCount) {
                    rect.bottom = this.b;
                    return;
                }
                return;
            } else {
                if (childAdapterPosition >= spanCount) {
                    rect.top = this.b;
                    return;
                }
                return;
            }
        }
        if (gridLayoutManager.getOrientation() == 0) {
            if (this.c) {
                int i4 = this.b;
                rect.top = ((spanCount - i) * i4) / spanCount;
                rect.bottom = (i4 * (i + 1)) / spanCount;
                if (gridLayoutManager.getReverseLayout()) {
                    if (childAdapterPosition < spanCount) {
                        rect.right = this.a;
                    }
                    rect.left = this.a;
                    return;
                } else {
                    if (childAdapterPosition < spanCount) {
                        rect.left = this.a;
                    }
                    rect.right = this.a;
                    return;
                }
            }
            int i5 = this.b;
            rect.top = (i5 * i) / spanCount;
            rect.bottom = (i5 * ((spanCount - 1) - i)) / spanCount;
            if (gridLayoutManager.getReverseLayout()) {
                if (childAdapterPosition >= spanCount) {
                    rect.right = this.a;
                }
            } else if (childAdapterPosition >= spanCount) {
                rect.left = this.a;
            }
        }
    }

    private void b(Rect rect, View view, RecyclerView recyclerView) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (linearLayoutManager.getOrientation() == 1) {
            if (this.c) {
                int i = this.a;
                rect.left = i;
                rect.right = i;
                if (linearLayoutManager.getReverseLayout()) {
                    if (childAdapterPosition == 0) {
                        rect.bottom = this.b;
                    }
                    rect.top = this.b;
                    return;
                } else {
                    if (childAdapterPosition == 0) {
                        rect.top = this.b;
                    }
                    rect.bottom = this.b;
                    return;
                }
            }
            int i2 = this.a;
            rect.left = i2;
            rect.right = i2;
            if (linearLayoutManager.getReverseLayout()) {
                if (childAdapterPosition > 0) {
                    rect.bottom = this.b;
                    return;
                }
                return;
            } else {
                if (childAdapterPosition > 0) {
                    rect.top = this.b;
                    return;
                }
                return;
            }
        }
        if (linearLayoutManager.getOrientation() == 0) {
            if (this.c) {
                int i3 = this.b;
                rect.top = i3;
                rect.bottom = i3;
                if (linearLayoutManager.getReverseLayout()) {
                    if (childAdapterPosition == 0) {
                        rect.right = this.a;
                    }
                    rect.left = this.a;
                    return;
                } else {
                    if (childAdapterPosition == 0) {
                        rect.left = this.a;
                    }
                    rect.right = this.a;
                    return;
                }
            }
            int i4 = this.b;
            rect.top = i4;
            rect.bottom = i4;
            if (linearLayoutManager.getReverseLayout()) {
                if (childAdapterPosition > 0) {
                    rect.right = this.a;
                }
            } else if (childAdapterPosition > 0) {
                rect.left = this.a;
            }
        }
    }

    private void c(Rect rect, View view, RecyclerView recyclerView) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) recyclerView.getLayoutManager();
        int spanIndex = ((StaggeredGridLayoutManager.LayoutParams) view.getLayoutParams()).getSpanIndex();
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int spanCount = staggeredGridLayoutManager.getSpanCount();
        if (staggeredGridLayoutManager.getOrientation() != 1) {
            if (staggeredGridLayoutManager.getOrientation() == 0) {
                this.c = false;
                int i = this.b;
                rect.top = (i * spanIndex) / spanCount;
                rect.bottom = (i * ((spanCount - 1) - spanIndex)) / spanCount;
                if (staggeredGridLayoutManager.getReverseLayout()) {
                    if (childAdapterPosition >= spanCount) {
                        rect.right = this.a;
                        return;
                    }
                    return;
                } else {
                    if (childAdapterPosition >= spanCount) {
                        rect.left = this.a;
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (this.c) {
            int i2 = this.a;
            rect.left = ((spanCount - spanIndex) * i2) / spanCount;
            rect.right = (i2 * (spanIndex + 1)) / spanCount;
            if (staggeredGridLayoutManager.getReverseLayout()) {
                if (childAdapterPosition < spanCount) {
                    rect.bottom = this.b;
                }
                rect.top = this.b;
                return;
            } else {
                if (childAdapterPosition < spanCount) {
                    rect.top = this.b;
                }
                rect.bottom = this.b;
                return;
            }
        }
        int i3 = this.a;
        rect.left = (i3 * spanIndex) / spanCount;
        rect.right = (i3 * ((spanCount - 1) - spanIndex)) / spanCount;
        if (staggeredGridLayoutManager.getReverseLayout()) {
            if (childAdapterPosition >= spanCount) {
                rect.bottom = this.b;
            }
        } else if (childAdapterPosition >= spanCount) {
            rect.top = this.b;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        if (recyclerView.getLayoutManager() instanceof GridLayoutManager) {
            a(rect, view, recyclerView);
        } else if (recyclerView.getLayoutManager() instanceof StaggeredGridLayoutManager) {
            c(rect, view, recyclerView);
        } else if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            b(rect, view, recyclerView);
        }
    }
}
