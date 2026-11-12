package com.huawei.hianalytics.visual;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.view.ViewParent;
import com.huawei.hianalytics.core.log.HiLog;
import com.huawei.hianalytics.visual.autocollect.EventType;
import com.huawei.hianalytics.visual.autocollect.exposure.ViewMark;
import java.lang.ref.WeakReference;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes33.dex */
public final class p1 implements g, t1 {
    public static volatile p1 f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashSet f11678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WeakHashMap f11679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n1 f11680c;
    public Rect d;
    public final Handler e;

    public p1() {
        HandlerThread handlerThread = new HandlerThread("HA-VISUAL-IMP");
        handlerThread.start();
        this.e = new Handler(handlerThread.getLooper());
    }

    public final void a(f fVar) {
        l1 l1Var;
        n1 n1Var;
        if (!fVar.f11638b.equals("activity_on_resume")) {
            if (fVar.f11638b.equals("activity_on_destroyed")) {
                this.f11679b.remove((Activity) fVar.f11637a.get());
                if (this.f11679b.isEmpty()) {
                    n1 n1Var2 = this.f11680c;
                    if (n1Var2 != null) {
                        n1Var2.f11671c = -1L;
                        n1Var2.f11669a.removeCallbacks(n1Var2);
                    }
                    if (a.f11616b == null) {
                        a.f11616b = new a();
                    }
                    a aVar = a.f11616b;
                    synchronized (aVar.f11617a) {
                        aVar.f11617a.remove(this);
                    }
                    u1.a().b(this);
                    return;
                }
                return;
            }
            return;
        }
        l1 l1Var2 = (l1) this.f11679b.get((Activity) fVar.f11637a.get());
        if (l1Var2 == null) {
            return;
        }
        try {
            Iterator it = l1Var2.f11661c.keySet().iterator();
            while (it.hasNext()) {
                m1 m1VarA = l1Var2.a((View) it.next());
                if (m1VarA != null) {
                    m1VarA.f11665b = false;
                }
            }
        } catch (ConcurrentModificationException unused) {
            HiLog.d("HAEO", "concurrent modification view timer");
        }
        Activity activity = (Activity) fVar.f11637a.get();
        WeakHashMap weakHashMap = this.f11679b;
        if (weakHashMap == null || (l1Var = (l1) weakHashMap.get(activity)) == null || (n1Var = l1Var.f11659a.f11673a) == null) {
            return;
        }
        n1Var.a();
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d2  */
    public final void b(ViewMark viewMark) {
        View view;
        n1 n1Var;
        if (w.a().f()) {
            return;
        }
        if (w.a().a(EventType.VIEW_EXPOSURE) || viewMark == null || (view = viewMark.getView()) == null) {
            return;
        }
        Activity activityA = o0.a(view.getContext(), view);
        if (activityA == null) {
            m.a().getClass();
            activityA = u.f11699c.b();
        }
        if (activityA == null) {
            HiLog.w("HAEO", "can not find activity from view");
            return;
        }
        HiLog.d("HAEO", "collect exposure view: " + viewMark.getEventId());
        b();
        l1 l1Var = (l1) this.f11679b.get(activityA);
        if (l1Var == null) {
            l1Var = new l1(activityA, this.e);
            this.f11679b.put(activityA, l1Var);
        }
        m1 m1Var = new m1();
        m1Var.f11664a = viewMark;
        new WeakReference(activityA);
        if (viewMark.getGlobalId() != null) {
            if (l1Var.f11660b.containsKey(viewMark.getGlobalId())) {
                m1 m1Var2 = (m1) l1Var.f11660b.get(viewMark.getGlobalId());
                if (m1Var2 == null) {
                    m1Var = null;
                } else {
                    View view2 = m1Var2.f11664a.getView();
                    m1 m1VarA = l1Var.a(view);
                    if (view2 != view) {
                        if (m1VarA != null && m1VarA != m1Var2) {
                            l1Var.d.put(m1VarA, "");
                        }
                        a(l1Var, view);
                        if (view2 == null) {
                            m1Var2.f11665b = false;
                        }
                    } else if (m1Var.equals(m1VarA)) {
                        m1Var = null;
                    }
                    m1Var2.f11664a = viewMark;
                    m1Var = m1Var2;
                }
            } else {
                l1Var.f11660b.put(viewMark.getGlobalId(), m1Var);
            }
            if (m1Var == null) {
                HiLog.d("HAEO", "nothing changed, global id: " + viewMark.getGlobalId());
                return;
            }
        } else if (l1Var.f11661c.containsKey(view)) {
            m1 m1VarA2 = l1Var.a(view);
            if (m1Var.equals(m1VarA2)) {
                m1VarA2.f11664a = m1Var.f11664a;
                HiLog.d("HAEO", "nothing changed, eventId: " + viewMark.getEventId());
                return;
            }
            a(l1Var, view);
        }
        view.setTag(R.id.hianalytics_exposure_view_tag, Boolean.TRUE);
        o1 o1Var = l1Var.f11659a;
        WeakHashMap weakHashMap = o1Var.f11674b;
        if (weakHashMap != null) {
            weakHashMap.put(view, m1Var);
            l1Var.f11661c.put(view, o1Var);
        }
        m.a().getClass();
        Activity activityC = u.f11699c.c();
        if (activityC == null || activityA != activityC || (n1Var = this.f11680c) == null) {
            return;
        }
        n1Var.a();
    }

    public final void c() {
        WeakHashMap weakHashMap;
        l1 l1Var;
        n1 n1Var;
        m.a().getClass();
        Activity activityC = u.f11699c.c();
        if (activityC == null || (weakHashMap = this.f11679b) == null || (l1Var = (l1) weakHashMap.get(activityC)) == null || (n1Var = l1Var.f11659a.f11673a) == null) {
            return;
        }
        n1Var.a();
    }

    public static p1 a() {
        if (f == null) {
            synchronized (p1.class) {
                if (f == null) {
                    f = new p1();
                }
            }
        }
        return f;
    }

    public static void a(l1 l1Var, View view) {
        WeakHashMap weakHashMap;
        view.setTag(R.id.hianalytics_exposure_view_tag, Boolean.FALSE);
        o1 o1Var = (o1) l1Var.f11661c.get(view);
        if (o1Var == null || (weakHashMap = o1Var.f11674b) == null) {
            return;
        }
        weakHashMap.remove(view);
        l1Var.f11661c.remove(view);
    }

    public final boolean a(ViewMark viewMark) {
        View view = viewMark.getView();
        if (view == null) {
            HashMap map = v1.f11708a;
        } else if (v1.i(view)) {
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                if (v1.i((View) parent) && (parent = parent.getParent()) != null) {
                }
            }
            if (viewMark.getVisibleScale() == 0.0f) {
                return true;
            }
            if (this.d == null) {
                this.d = new Rect();
            }
            view.getLocalVisibleRect(this.d);
            Rect rect = this.d;
            int iAbs = Math.abs(rect.right - rect.left);
            Rect rect2 = this.d;
            return ((float) (Math.abs(rect2.top - rect2.bottom) * iAbs)) >= viewMark.getVisibleScale() * ((float) (view.getMeasuredWidth() * view.getMeasuredHeight()));
        }
        return false;
    }

    public final void b() {
        if (this.f11679b != null) {
            return;
        }
        this.f11679b = new WeakHashMap();
        this.f11680c = new n1(new Runnable() { // from class: com.huawei.hianalytics.visual.p1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.c();
            }
        }, this.e);
        if (a.f11616b == null) {
            a.f11616b = new a();
        }
        a aVar = a.f11616b;
        synchronized (aVar.f11617a) {
            aVar.f11617a.add(this);
        }
        u1.a().a(this);
    }

    public static void a(m1 m1Var) {
        Context context;
        View view = m1Var.f11664a.getView();
        JSONObject eventAttributes = m1Var.f11664a.getEventAttributes();
        String eventId = m1Var.f11664a.getEventId();
        if (w.a().f()) {
            return;
        }
        if (w.a().a(EventType.VIEW_EXPOSURE) || (context = view.getContext()) == null) {
            return;
        }
        Activity activityA = o0.a(context, view);
        if (activityA != null) {
            if (w.a().i(activityA.getClass())) {
                return;
            }
        }
        Object objA = t.a(view, activityA);
        if (objA != null) {
            if (w.a().b(objA.getClass())) {
                return;
            }
        }
        if (v1.h(view)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("$view_id", v1.e(view));
            jSONObject.put("$event_name", eventId);
            r1 r1VarD = v1.d(view);
            jSONObject.put("$view_type", r1VarD.f11691c);
            jSONObject.put("$view_content", v1.a(r1VarD.d));
            i1.a(o0.b(activityA), jSONObject);
            i1.a(t.a(activityA, objA), jSONObject);
            i1.a(eventAttributes, jSONObject);
            JSONObject jSONObject2 = (JSONObject) view.getTag(R.id.hianalytics_view_custom_property_tag);
            if (jSONObject2 != null) {
                jSONObject.put("$custom_property", jSONObject2);
            }
            if (objA != null) {
                i1.b(objA, jSONObject);
            } else {
                i1.b(activityA, jSONObject);
            }
            w.a().a("$ViewExposure", jSONObject);
        } catch (Exception unused) {
            HiLog.w("HAEO", "fail to report view exposure event");
        }
    }
}
