package com.huawei.ui.main.stories.template;

import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.ui.commonui.popupview.PopViewList;
import defpackage.njy;
import defpackage.qrs;
import defpackage.wpo;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public abstract class PopMenuManager implements IMenuItemManager {
    private static String TAG = "PopMenuManager";
    private PopViewList mPopViewList;

    protected abstract View getTitleBar();

    ArrayList<String> getItemNameList(List<wpo> list) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (wpo wpoVar : list) {
            if (wpoVar != null) {
                arrayList.add(wpoVar.e());
            }
        }
        return arrayList;
    }

    public void showPopMenu() {
        if (getTitleBar() == null || getTitleBar().getContext() == null) {
            LogUtil.c(TAG, "getPopViewList getTitleBar or getContext is null");
            return;
        }
        final List<wpo> menuItemList = getMenuItemList();
        ArrayList<String> itemNameList = getItemNameList(menuItemList);
        if (njy.e(itemNameList) || njy.e(menuItemList)) {
            LogUtil.c(TAG, "showPopMenu popMenuList or menuItemList is null");
            return;
        }
        PopViewList popViewList = new PopViewList(BaseApplication.b(), getTitleBar(), itemNameList);
        this.mPopViewList = popViewList;
        popViewList.b(new PopViewList.PopViewClickListener() { // from class: com.huawei.ui.main.stories.template.PopMenuManager.3
            @Override // com.huawei.ui.commonui.popupview.PopViewList.PopViewClickListener
            public void setOnClick(int i) {
                if (qrs.c(800)) {
                    return;
                }
                if (njy.e(menuItemList, i)) {
                    LogUtil.c(PopMenuManager.TAG, "showPopMenu isOutOfBounds");
                } else if (menuItemList.get(i) == null || ((wpo) menuItemList.get(i)).c() == null) {
                    LogUtil.c(PopMenuManager.TAG, "showPopMenu get(position) is null");
                } else {
                    ((wpo) menuItemList.get(i)).c().onItemClick();
                }
            }
        });
    }

    public void dismissPopMenu() {
        PopViewList popViewList = this.mPopViewList;
        if (popViewList != null) {
            popViewList.d();
        }
    }
}
