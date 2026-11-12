package defpackage;

import android.content.Context;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class zzd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HashMap<String, Constructor<? extends qzd>> f41825b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HashMap<Integer, ArrayList<qzd>> f41826a = new HashMap<>();

    static {
        HashMap<String, Constructor<? extends qzd>> map = new HashMap<>();
        f41825b = map;
        try {
            map.put("KeyAttribute", rzd.class.getConstructor(new Class[0]));
            f41825b.put("KeyPosition", i0e.class.getConstructor(new Class[0]));
            f41825b.put("KeyCycle", tzd.class.getConstructor(new Class[0]));
            f41825b.put("KeyTimeCycle", l0e.class.getConstructor(new Class[0]));
            f41825b.put("KeyTrigger", m0e.class.getConstructor(new Class[0]));
        } catch (NoSuchMethodException unused) {
        }
    }

    public zzd() {
    }

    public void a(n8g n8gVar) {
        ArrayList<qzd> arrayList = this.f41826a.get(-1);
        if (arrayList != null) {
            n8gVar.b(arrayList);
        }
    }

    public void b(n8g n8gVar) {
        ArrayList<qzd> arrayList = this.f41826a.get(Integer.valueOf(n8gVar.c));
        if (arrayList != null) {
            n8gVar.b(arrayList);
        }
        ArrayList<qzd> arrayList2 = this.f41826a.get(-1);
        if (arrayList2 != null) {
            for (qzd qzdVar : arrayList2) {
                if (qzdVar.f(((ConstraintLayout.LayoutParams) n8gVar.f27655b.getLayoutParams()).c0)) {
                    n8gVar.a(qzdVar);
                }
            }
        }
    }

    public void c(qzd qzdVar) {
        if (!this.f41826a.containsKey(Integer.valueOf(qzdVar.f32024b))) {
            this.f41826a.put(Integer.valueOf(qzdVar.f32024b), new ArrayList<>());
        }
        ArrayList<qzd> arrayList = this.f41826a.get(Integer.valueOf(qzdVar.f32024b));
        if (arrayList != null) {
            arrayList.add(qzdVar);
        }
    }

    public ArrayList<qzd> d(int i) {
        return this.f41826a.get(Integer.valueOf(i));
    }

    public zzd(Context context, XmlPullParser xmlPullParser) {
        HashMap<String, ConstraintAttribute> map;
        HashMap<String, ConstraintAttribute> map2;
        try {
            int eventType = xmlPullParser.getEventType();
            qzd qzdVar = null;
            while (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3 && "KeyFrameSet".equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    String name = xmlPullParser.getName();
                    if (f41825b.containsKey(name)) {
                        try {
                            Constructor<? extends qzd> constructor = f41825b.get(name);
                            if (constructor != null) {
                                qzd qzdVarNewInstance = constructor.newInstance(new Object[0]);
                                try {
                                    qzdVarNewInstance.e(context, Xml.asAttributeSet(xmlPullParser));
                                    c(qzdVarNewInstance);
                                } catch (Exception unused) {
                                }
                                qzdVar = qzdVarNewInstance;
                            } else {
                                throw new NullPointerException("Keymaker for " + name + " not found");
                            }
                        } catch (Exception unused2) {
                        }
                    } else if (name.equalsIgnoreCase("CustomAttribute")) {
                        if (qzdVar != null && (map2 = qzdVar.e) != null) {
                            ConstraintAttribute.i(context, xmlPullParser, map2);
                        }
                    } else if (name.equalsIgnoreCase("CustomMethod") && qzdVar != null && (map = qzdVar.e) != null) {
                        ConstraintAttribute.i(context, xmlPullParser, map);
                    }
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }
}
