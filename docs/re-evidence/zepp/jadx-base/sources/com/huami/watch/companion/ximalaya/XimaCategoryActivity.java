package com.huami.watch.companion.ximalaya;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.watch.companion.delegate.CompanionToolUtilsDelegate;
import com.huami.watch.companion.ui.view.ActionbarLayout;
import com.huami.watch.util.DeviceCompatibility;
import com.ximalaya.ting.android.opensdk.datatrasfer.CommonRequest;
import com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack;
import com.ximalaya.ting.android.opensdk.model.category.Category;
import com.ximalaya.ting.android.opensdk.model.category.CategoryList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public class XimaCategoryActivity extends Activity {
    public static final String MAIN_MODULE_TOOL_KEY_NAME = "XIMALAYA";
    private static final String g = "XimaCategory";
    public static String[] nNames = {"3D体验馆", "脱口秀", "英语", "小语种", "百家讲坛", "名校公开课", "诗歌", "其他"};
    private RecyclerView b;
    private List<Category> c;
    private CategoryAdapter d;
    private EditText e;
    private CategoryList a = null;
    private boolean f = false;

    public static class MyDecoration extends RecyclerView.ItemDecoration {
        public static final int[] ATRRS = {R.attr.gridViewStyle};
        public static final int HORIZONTAL_LIST = 0;
        public static final int VERTICAL_LIST = 1;
        private Context a;
        private Drawable b;
        private int c;

        public MyDecoration(Context context, int i) {
            this.a = context;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ATRRS);
            this.b = this.a.getResources().getDrawable(com.huami.watch.companion.R.drawable.divider);
            typedArrayObtainStyledAttributes.recycle();
            setOrientation(i);
        }

        public void drawHorizontalLine(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int paddingLeft = recyclerView.getPaddingLeft();
            int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            int childCount = recyclerView.getChildCount();
            int i = 0;
            while (i < childCount) {
                int i2 = i + 1;
                if (i2 % 6 == 0) {
                    View childAt = recyclerView.getChildAt(i);
                    int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).bottomMargin;
                    int intrinsicHeight = this.b.getIntrinsicHeight() + bottom;
                    this.b.setBounds(paddingLeft, bottom, width, intrinsicHeight);
                    this.b.draw(canvas);
                    Log.d("wnw", paddingLeft + " " + bottom + " " + width + "   " + intrinsicHeight + " " + i);
                }
                i = i2;
            }
        }

        public void drawVerticalLine(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int paddingTop = recyclerView.getPaddingTop();
            int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            int i = 0;
            while (i < childCount) {
                int i2 = i + 1;
                if (i2 % 6 == 0) {
                    View childAt = recyclerView.getChildAt(i);
                    int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) ((RecyclerView.LayoutParams) childAt.getLayoutParams())).rightMargin;
                    this.b.setBounds(right, paddingTop, this.b.getIntrinsicWidth() + right, height);
                    this.b.draw(canvas);
                }
                i = i2;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            if (this.c == 0) {
                rect.set(0, 0, 0, this.b.getIntrinsicHeight());
            } else {
                rect.set(0, 0, this.b.getIntrinsicWidth(), 0);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            if (this.c == 0) {
                drawVerticalLine(canvas, recyclerView, state);
            } else {
                drawHorizontalLine(canvas, recyclerView, state);
            }
        }

        public void setOrientation(int i) {
            if (i != 0 && i != 1) {
                throw new IllegalArgumentException("invalid orientation");
            }
            this.c = i;
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XimaCategoryActivity.this.onBackPressed();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            XimaCategoryActivity.this.startActivity(new Intent(XimaCategoryActivity.this, (Class<?>) XimalayaSearchingActivity.class));
        }
    }

    public class c implements IDataCallBack<CategoryList> {
        public c() {
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(CategoryList categoryList) {
            StringBuilder sb = new StringBuilder();
            sb.append("onSuccess ");
            sb.append(categoryList != null);
            Log.e(XimaCategoryActivity.g, sb.toString());
            if (categoryList != null && categoryList.getCategories() != null && categoryList.getCategories().size() != 0) {
                if (XimaCategoryActivity.this.a == null) {
                    XimaCategoryActivity.this.a = categoryList;
                } else {
                    XimaCategoryActivity.this.a.getCategories().clear();
                    XimaCategoryActivity.this.a.getCategories().addAll(categoryList.getCategories());
                }
                if (XimaCategoryActivity.this.d == null) {
                    XimaCategoryActivity.this.c = categoryList.getCategories();
                    XimaCategoryActivity.this.l();
                    XimaCategoryActivity ximaCategoryActivity = XimaCategoryActivity.this;
                    ximaCategoryActivity.d = new CategoryAdapter(ximaCategoryActivity, ximaCategoryActivity.c);
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(XimaCategoryActivity.this, 2);
                    XimaCategoryActivity.this.b.setLayoutManager(gridLayoutManager);
                    gridLayoutManager.setOrientation(1);
                    XimaCategoryActivity.this.b.setAdapter(XimaCategoryActivity.this.d);
                    XimaCategoryActivity.this.b.addItemDecoration(new DividerItemDecoration(XimaCategoryActivity.this, 1));
                } else {
                    XimaCategoryActivity.this.l();
                    XimaCategoryActivity.this.d.notifyDataSetChanged();
                }
                List<Category> categories = categoryList.getCategories();
                Iterator<Category> it2 = categories.iterator();
                while (it2.hasNext()) {
                    Log.d(XimaCategoryActivity.g, "edittext result is " + it2.next().toString());
                }
                XimaCategoryActivity.this.q(categories);
            }
            XimaCategoryActivity.this.f = false;
        }

        @Override // com.ximalaya.ting.android.opensdk.datatrasfer.IDataCallBack
        public void onError(int i, String str) {
            Log.d("XimaCategoryActivity", "categories request error , reason is " + str);
            XimaCategoryActivity.this.f = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        List<Category> list = this.c;
        if (list == null || list.size() == 0) {
            return;
        }
        int i = 0;
        while (i < this.c.size()) {
            if (n(this.c.get(i).getCategoryName())) {
                this.c.remove(i);
                i--;
            }
            i++;
        }
    }

    private void m() {
        this.b = (RecyclerView) findViewById(com.huami.watch.companion.R.id.categories_recycleview);
        final ActionbarLayout actionbarLayout = (ActionbarLayout) findViewById(com.huami.watch.companion.R.id.actionbar_title);
        actionbarLayout.setTitleText(getString(com.huami.watch.companion.R.string.widget_ximalaya));
        actionbarLayout.setBackArrowClickListener(new a());
        actionbarLayout.setRightImage(com.huami.watch.companion.R.drawable.appbar_icon_func);
        actionbarLayout.setRightImageVisible(false);
        actionbarLayout.setRightImageClickListener(new View.OnClickListener() { // from class: u09
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.o(actionbarLayout, view);
            }
        });
        EditText editText = (EditText) findViewById(com.huami.watch.companion.R.id.categories_research);
        this.e = editText;
        editText.setFocusable(false);
        this.e.setOnClickListener(new b());
    }

    private boolean n(String str) {
        if (str != null) {
            for (String str2 : nNames) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(ActionbarLayout actionbarLayout, View view) {
        CompanionToolUtilsDelegate.getInstance().getToolUtil().addToMyTools(MAIN_MODULE_TOOL_KEY_NAME);
        Toast.makeText(getApplicationContext(), com.huami.assistant.R.string.tool_add_success, 0).show();
        actionbarLayout.setRightImageVisible(false);
    }

    private void p() {
        if (this.f) {
            return;
        }
        this.f = true;
        CommonRequest.getCategories(null, new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(List<Category> list) {
        SharedPreferences.Editor editorEdit = getSharedPreferences("categories", 0).edit();
        for (Category category : list) {
            Log.d(g, "categories id  " + category.getId() + "categories name " + category.getCategoryName());
            editorEdit.putString(String.valueOf(category.getId()), category.getCategoryName());
        }
        editorEdit.commit();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.huami.watch.companion.R.layout.xima_category_layout);
        DeviceCompatibility.setStatusBarDarkMode(this, true);
        m();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        p();
    }
}
