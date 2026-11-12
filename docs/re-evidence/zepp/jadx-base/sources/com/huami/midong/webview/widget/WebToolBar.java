package com.huami.midong.webview.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.huami.midong.webview.nativejsapi.IJsBridgeTitleCallback;
import com.huami.watch.jsbridge.R;

/* JADX INFO: loaded from: classes11.dex */
public class WebToolBar extends FrameLayout {
    private ImageView mMenuView;
    private IJsBridgeTitleCallback mTitleCallback;
    private TextView mTitleView;
    private SparseArray<MenuData> menuList;

    public static class MenuBuilder {
        public SparseArray<MenuData> menuList = new SparseArray<>();

        public MenuBuilder addAuth(String str) {
            MenuData menuData = new MenuData();
            int i = R.id.web_menu_auth;
            menuData.setMenuId(i);
            menuData.setMenuTitle(R.string.webview_more_menu_cancel_auth);
            menuData.setMenuIcon(R.drawable.web_title_auth);
            menuData.setUrl(str);
            this.menuList.put(i, menuData);
            return this;
        }

        public MenuBuilder addMenu(@IdRes int i, @StringRes int i2, @DrawableRes int i3, Object obj, String str) {
            MenuData menuData = new MenuData();
            menuData.setMenuId(i);
            menuData.setMenuTitle(i2);
            menuData.setMenuIcon(i3);
            menuData.setExtraData(obj);
            menuData.setUrl(str);
            this.menuList.put(i, menuData);
            return this;
        }

        public MenuBuilder addRefresh() {
            MenuData menuData = new MenuData();
            int i = R.id.web_menu_refresh;
            menuData.setMenuId(i);
            menuData.setMenuTitle(R.string.webview_more_menu_refresh);
            menuData.setMenuIcon(R.drawable.web_title_refresh);
            this.menuList.put(i, menuData);
            return this;
        }

        public MenuBuilder addResize() {
            MenuData menuData = new MenuData();
            int i = R.id.web_menu_resize;
            menuData.setMenuId(i);
            menuData.setMenuTitle(R.string.webview_more_menu_resize);
            menuData.setMenuIcon(R.drawable.web_title_resize);
            this.menuList.put(i, menuData);
            return this;
        }

        public MenuBuilder addShare(Object obj) {
            MenuData menuData = new MenuData();
            int i = R.id.web_menu_share;
            menuData.setMenuId(i);
            menuData.setMenuTitle(R.string.webview_more_menu_share);
            menuData.setMenuIcon(R.drawable.web_title_share);
            menuData.setExtraData(obj);
            this.menuList.put(i, menuData);
            return this;
        }

        public SparseArray<MenuData> build() {
            return this.menuList;
        }
    }

    public static class MenuData {
        private Object extraData;

        @DrawableRes
        private int menuIcon;

        @IdRes
        private int menuId;

        @StringRes
        private int menuTitle;
        private String url;

        public Object getExtraData() {
            return this.extraData;
        }

        public int getMenuIcon() {
            return this.menuIcon;
        }

        public int getMenuId() {
            return this.menuId;
        }

        public int getMenuTitle() {
            return this.menuTitle;
        }

        public String getUrl() {
            return this.url;
        }

        public void setExtraData(Object obj) {
            this.extraData = obj;
        }

        public void setMenuIcon(@DrawableRes int i) {
            this.menuIcon = i;
        }

        public void setMenuId(@IdRes int i) {
            this.menuId = i;
        }

        public void setMenuTitle(@StringRes int i) {
            this.menuTitle = i;
        }

        public void setUrl(String str) {
            this.url = str;
        }
    }

    public interface OnMenuClick {
        void onItemClick(int i);
    }

    public WebToolBar(@NonNull Context context) {
        super(context);
        this.menuList = new SparseArray<>();
        initView(context);
    }

    private void initView(Context context) {
        View.inflate(context, R.layout.web_title_bar, this);
        findViewById(R.id.web_title_back).setOnClickListener(new View.OnClickListener() { // from class: cq8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.lambda$initView$0(view);
            }
        });
        this.mTitleView = (TextView) findViewById(R.id.web_title);
        this.mMenuView = (ImageView) findViewById(R.id.web_title_options);
        invalidateMenu();
    }

    private void invalidateMenu() {
        SparseArray<MenuData> sparseArray = this.menuList;
        if (sparseArray == null || sparseArray.size() == 0) {
            this.mMenuView.setVisibility(4);
            this.mMenuView.setOnClickListener(null);
        } else if (this.menuList.size() != 1) {
            this.mMenuView.setVisibility(0);
            this.mMenuView.setImageResource(R.drawable.web_title_more);
            this.mMenuView.setOnClickListener(new View.OnClickListener() { // from class: bq8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.showPop(view);
                }
            });
        } else {
            this.mMenuView.setVisibility(0);
            final MenuData menuDataValueAt = this.menuList.valueAt(0);
            this.mMenuView.setImageResource(menuDataValueAt.getMenuIcon());
            this.mMenuView.setOnClickListener(new View.OnClickListener() { // from class: dq8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.lambda$invalidateMenu$1(menuDataValueAt, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initView$0(View view) {
        IJsBridgeTitleCallback iJsBridgeTitleCallback = this.mTitleCallback;
        if (iJsBridgeTitleCallback != null) {
            iJsBridgeTitleCallback.onBackClick();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$invalidateMenu$1(MenuData menuData, View view) {
        onMenuItemClick(menuData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$showPop$2(MenuItem menuItem) {
        onMenuItemClick(this.menuList.get(menuItem.getItemId()));
        return true;
    }

    private void onMenuItemClick(MenuData menuData) {
        if (this.mTitleCallback == null) {
            return;
        }
        if (R.id.web_menu_share == menuData.getMenuId()) {
            this.mTitleCallback.onShare(menuData.getExtraData());
            return;
        }
        if (R.id.web_menu_resize == menuData.getMenuId()) {
            this.mTitleCallback.onResize();
        } else if (R.id.web_menu_auth == menuData.getMenuId()) {
            this.mTitleCallback.onCancelAuth(menuData.getUrl());
        } else if (R.id.web_menu_refresh == menuData.getMenuId()) {
            this.mTitleCallback.onRefresh();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showPop(View view) {
        PopupMenu popupMenu = new PopupMenu(getContext(), view);
        popupMenu.getMenu().clear();
        for (int i = 0; i < this.menuList.size(); i++) {
            MenuData menuDataValueAt = this.menuList.valueAt(i);
            popupMenu.getMenu().add(0, menuDataValueAt.getMenuId(), i, menuDataValueAt.getMenuTitle());
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: eq8
            @Override // android.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return this.a.lambda$showPop$2(menuItem);
            }
        });
        popupMenu.show();
    }

    public void setMenu(@NonNull SparseArray<MenuData> sparseArray) {
        this.menuList.clear();
        this.menuList = sparseArray;
        invalidateMenu();
    }

    public void setTitle(String str) {
        this.mTitleView.setText(str);
    }

    public void setTitleCallback(IJsBridgeTitleCallback iJsBridgeTitleCallback) {
        this.mTitleCallback = iJsBridgeTitleCallback;
    }

    public WebToolBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.menuList = new SparseArray<>();
        initView(context);
    }

    public WebToolBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.menuList = new SparseArray<>();
        initView(context);
    }

    @TargetApi(21)
    public WebToolBar(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.menuList = new SparseArray<>();
        initView(context);
    }
}
