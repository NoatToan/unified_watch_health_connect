package w6;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap<String, Constructor<? extends d>> f182818b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap<Integer, ArrayList<d>> f182819a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends d>> map = new HashMap<>();
        f182818b = map;
        try {
            map.put("KeyAttribute", e.class.getConstructor(null));
            map.put("KeyPosition", h.class.getConstructor(null));
            map.put("KeyCycle", f.class.getConstructor(null));
            map.put("KeyTimeCycle", j.class.getConstructor(null));
            map.put("KeyTrigger", k.class.getConstructor(null));
        } catch (NoSuchMethodException unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public g(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, androidx.constraintlayout.widget.a> map;
        HashMap<String, androidx.constraintlayout.widget.a> map2;
        d jVar;
        try {
            int eventType = xmlPullParser.getEventType();
            d dVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (f182818b.containsKey(name)) {
                        switch (name.hashCode()) {
                            case -300573030:
                                if (!name.equals("KeyTimeCycle")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                jVar = new j();
                                jVar.d(context, Xml.asAttributeSet(xmlPullParser));
                                b(jVar);
                                dVar = jVar;
                                break;
                                break;
                            case -298435811:
                                if (!name.equals("KeyAttribute")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                jVar = new e();
                                jVar.d(context, Xml.asAttributeSet(xmlPullParser));
                                b(jVar);
                                dVar = jVar;
                                break;
                                break;
                            case 540053991:
                                if (!name.equals("KeyCycle")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                jVar = new f();
                                jVar.d(context, Xml.asAttributeSet(xmlPullParser));
                                b(jVar);
                                dVar = jVar;
                                break;
                                break;
                            case 1153397896:
                                if (!name.equals("KeyPosition")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                jVar = new h();
                                jVar.d(context, Xml.asAttributeSet(xmlPullParser));
                                b(jVar);
                                dVar = jVar;
                                break;
                                break;
                            case 1308496505:
                                if (!name.equals("KeyTrigger")) {
                                    throw new NullPointerException("Key " + name + " not found");
                                }
                                jVar = new k();
                                jVar.d(context, Xml.asAttributeSet(xmlPullParser));
                                b(jVar);
                                dVar = jVar;
                                break;
                                break;
                            default:
                                throw new NullPointerException("Key " + name + " not found");
                        }
                        return;
                    }
                    if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (dVar != null && (map2 = dVar.f182781d) != null) {
                            androidx.constraintlayout.widget.a.d(context, xmlPullParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && dVar != null && (map = dVar.f182781d) != null) {
                        androidx.constraintlayout.widget.a.d(context, xmlPullParser, map);
                    }
                } else if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public final void a(n nVar) {
        ArrayList<d> arrayList = nVar.f182910w;
        Integer numValueOf = Integer.valueOf(nVar.f182890c);
        HashMap<Integer, ArrayList<d>> map = this.f182819a;
        ArrayList<d> arrayList2 = map.get(numValueOf);
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
        }
        ArrayList<d> arrayList3 = map.get(-1);
        if (arrayList3 != null) {
            for (d dVar : arrayList3) {
                String str = ((ConstraintLayout.b) nVar.f182889b.getLayoutParams()).Y;
                String str2 = dVar.f182780c;
                if ((str2 == null || str == null) ? false : str.matches(str2)) {
                    arrayList.add(dVar);
                }
            }
        }
    }

    public final void b(d dVar) {
        Integer numValueOf = Integer.valueOf(dVar.f182779b);
        HashMap<Integer, ArrayList<d>> map = this.f182819a;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(dVar.f182779b), new ArrayList<>());
        }
        ArrayList<d> arrayList = map.get(Integer.valueOf(dVar.f182779b));
        if (arrayList != null) {
            arrayList.add(dVar);
        }
    }

    public g() {
    }
}
