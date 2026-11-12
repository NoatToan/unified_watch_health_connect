package com.huami.chart.style;

import android.content.Context;
import com.huami.chart.render.BaseRender;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BaseStyle implements IStylePriority {
    private boolean a = true;
    private BaseRender b;

    public abstract int getPriority();

    public BaseRender getRender() {
        return this.b;
    }

    public int getRenderPriority() {
        return getPriority();
    }

    public boolean needRefresh() {
        return this.a;
    }

    public abstract void reInitPropertyFromJson(Context context, JSONObject jSONObject);

    public void setNeedRefresh(boolean z) {
        this.a = z;
    }

    public void setRender(BaseRender baseRender) {
        this.b = baseRender;
    }
}
