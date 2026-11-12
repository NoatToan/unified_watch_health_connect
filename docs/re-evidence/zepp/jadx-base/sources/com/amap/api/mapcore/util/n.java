package com.amap.api.mapcore.util;

import android.content.Context;
import android.opengl.GLES20;
import com.amap.api.maps.model.GL3DModel;
import com.amap.api.maps.model.GL3DModelOptions;
import com.autonavi.base.amap.api.mapcore.IAMapDelegate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n {
    private Context b;
    private IAMapDelegate c;
    private long a = 0;
    private List<cp> d = new ArrayList();
    private List<Integer> e = new ArrayList();

    public n(Context context, IAMapDelegate iAMapDelegate) {
        this.b = context;
        this.c = iAMapDelegate;
    }

    public final GL3DModel a(GL3DModelOptions gL3DModelOptions) {
        GL3DModel gL3DModel;
        if (gL3DModelOptions == null) {
            return null;
        }
        cp cpVar = new cp(this, gL3DModelOptions, this.c);
        StringBuilder sb = new StringBuilder("model_");
        long j = this.a;
        this.a = 1 + j;
        sb.append(j);
        cpVar.a(sb.toString());
        synchronized (this.d) {
            this.d.add(cpVar);
            gL3DModel = new GL3DModel(cpVar);
        }
        return gL3DModel;
    }

    public final void b() {
        List<cp> list = this.d;
        if (list != null) {
            list.clear();
        }
    }

    public final void c() {
        List<cp> list = this.d;
        if (list != null) {
            Iterator<cp> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().destroy();
            }
            this.d.clear();
        }
    }

    public final void d() {
        List<Integer> list = this.e;
        if (list != null) {
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                GLES20.glDeleteTextures(1, new int[]{it2.next().intValue()}, 0);
            }
        }
    }

    public final boolean a() {
        boolean zA = true;
        for (cp cpVar : this.d) {
            if (cpVar.isVisible()) {
                zA &= cpVar.a();
            }
        }
        return zA;
    }

    public final void a(String str) {
        try {
            List<cp> list = this.d;
            if (list == null || list.size() <= 0) {
                return;
            }
            cp cpVar = null;
            for (int i = 0; i < this.d.size(); i++) {
                cpVar = this.d.get(i);
                if (str.equals(cpVar.getId())) {
                    break;
                }
            }
            if (cpVar != null) {
                this.d.remove(cpVar);
                cpVar.destroy();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void a(int i) {
        this.e.add(Integer.valueOf(i));
    }

    public final boolean a(cp cpVar) {
        return this.d.contains(cpVar);
    }
}
