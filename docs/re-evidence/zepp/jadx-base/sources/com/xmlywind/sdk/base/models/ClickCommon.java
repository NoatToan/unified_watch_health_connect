package com.xmlywind.sdk.base.models;

import com.xmlywind.sdk.common.utils.q;
import java.io.Serializable;

/* JADX INFO: loaded from: classes22.dex */
public class ClickCommon implements Serializable {
    public static final String CLICK_AREA_APPINFO = "appinfo";
    public static final String CLICK_AREA_BTN = "btn";
    public static final String CLICK_AREA_MATERIAL = "material";
    public static final String CLICK_SCENE_APPINFO = "appinfo";
    public static final String CLICK_SCENE_PREVIEW = "preview";
    public static final String CLICK_SCENE_TEMPLATE = "template";
    public int auto_click;
    public String clickCoordinate;
    public String click_area;
    public String click_scene;
    public q down;
    public boolean is_final_click;
    public q up;

    public String getClickCoordinate() {
        q qVar = this.down;
        if (qVar != null && this.up != null) {
            this.clickCoordinate = String.format("%s,%s,%s,%s", Integer.valueOf(qVar.a()), Integer.valueOf(this.down.b()), Integer.valueOf(this.up.a()), Integer.valueOf(this.up.b()));
        }
        return this.clickCoordinate;
    }
}
