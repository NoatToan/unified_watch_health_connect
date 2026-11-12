package com.dylanvann.fastimage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import defpackage.ba9;
import defpackage.cnk;
import defpackage.da9;
import defpackage.e0b;
import defpackage.ea9;
import defpackage.fa9;
import defpackage.g9p;
import defpackage.rok;
import defpackage.zmk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class b extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ReadableMap f7067b;
    public Drawable c;
    public e0b d;

    public b(Context context) {
        super(context);
        this.f7066a = false;
        this.f7067b = null;
        this.c = null;
    }

    public void a(rok rokVar) {
        if (rokVar == null || getTag() == null || !(getTag() instanceof zmk)) {
            return;
        }
        rokVar.l(this);
    }

    public final boolean d(String str) {
        return str == null || str.trim().isEmpty();
    }

    @SuppressLint({"CheckResult"})
    public void e(FastImageViewManager fastImageViewManager, rok rokVar, Map<String, List<b>> map) {
        if (this.f7066a) {
            ReadableMap readableMap = this.f7067b;
            if ((readableMap == null || !readableMap.hasKey(SportRecordBundleKey.BUNDLE_PARAM_URI) || d(this.f7067b.getString(SportRecordBundleKey.BUNDLE_PARAM_URI))) && this.c == null) {
                a(rokVar);
                e0b e0bVar = this.d;
                if (e0bVar != null) {
                    ba9.c(e0bVar.h());
                }
                setImageDrawable(null);
                return;
            }
            ea9 ea9VarC = fa9.c(getContext(), this.f7067b);
            if (ea9VarC != null && ea9VarC.e().toString().length() == 0) {
                RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((g9p) getContext()).getJSModule(RCTEventEmitter.class);
                int id = getId();
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("message", "Invalid source prop:" + this.f7067b);
                rCTEventEmitter.receiveEvent(id, "onFastImageError", writableNativeMap);
                a(rokVar);
                e0b e0bVar2 = this.d;
                if (e0bVar2 != null) {
                    ba9.c(e0bVar2.h());
                }
                setImageDrawable(null);
                return;
            }
            e0b e0bVarG = ea9VarC == null ? null : ea9VarC.g();
            this.d = e0bVarG;
            a(rokVar);
            String strH = e0bVarG == null ? null : e0bVarG.h();
            if (e0bVarG != null) {
                ba9.b(strH, fastImageViewManager);
                List<b> list = map.get(strH);
                if (list != null && !list.contains(this)) {
                    list.add(this);
                } else if (list == null) {
                    map.put(strH, new ArrayList(Collections.singletonList(this)));
                }
            }
            g9p g9pVar = (g9p) getContext();
            if (ea9VarC != null) {
                ((RCTEventEmitter) g9pVar.getJSModule(RCTEventEmitter.class)).receiveEvent(getId(), "onFastImageLoadStart", new WritableNativeMap());
            }
            if (rokVar != null) {
                cnk<Drawable> cnkVarA = rokVar.q(ea9VarC != null ? ea9VarC.i() : null).a(fa9.d(g9pVar, ea9VarC, this.f7067b).X(this.c).g(this.c));
                if (strH != null) {
                    cnkVarA.z0(new da9(strH));
                }
                cnkVarA.x0(this);
            }
        }
    }

    public void f(Drawable drawable) {
        this.f7066a = true;
        this.c = drawable;
    }

    public void g(ReadableMap readableMap) {
        this.f7066a = true;
        this.f7067b = readableMap;
    }
}
