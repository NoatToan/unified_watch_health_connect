package com.garmin.android.apps.connectmobile.smartnotification;

import android.content.Context;
import android.graphics.Color;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.Iterator;
import java.util.List;
import un1.f;

/* JADX INFO: loaded from: classes10.dex */
public class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ PartialTableView.b f44349a;

    public d(PartialTableView.b bVar) {
        this.f44349a = bVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() {
        PartialTableView.b bVar = this.f44349a;
        PartialTableView.this.removeAllViews();
        f fVar = bVar.f44300a;
        List<un1.a<T>> list = bVar.f44301b;
        fVar.getClass();
        Context context = fVar.f172056b;
        TableRow tableRow = new TableRow(context);
        tableRow.setBackgroundColor(Color.rgb(80, 30, 30));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            un1.a aVar = (un1.a) it.next();
            TextView textView = new TextView(context);
            textView.setLayoutParams(new TableRow.LayoutParams(-2, -2));
            textView.setPadding(20, 0, 20, 0);
            textView.setText(aVar.f172046a);
            tableRow.addView(textView);
        }
        PartialTableView.this.addView(tableRow);
        for (int i14 = 0; i14 < bVar.f44300a.f172055a.size(); i14++) {
            f fVar2 = bVar.f44300a;
            List<un1.a<T>> list2 = bVar.f44301b;
            fVar2.getClass();
            Context context2 = fVar2.f172056b;
            TableRow tableRow2 = new TableRow(context2);
            int i15 = i14 % 2;
            if (i15 == 1) {
                tableRow2.setBackgroundColor(Color.rgb(30, 30, 30));
            } else {
                tableRow2.setBackgroundColor(Color.rgb(0, 0, 0));
            }
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                un1.a aVar2 = (un1.a) it3.next();
                TextView textView2 = new TextView(context2);
                textView2.setLayoutParams(new TableRow.LayoutParams(-2, -2));
                textView2.setPadding(20, 0, 20, 0);
                textView2.setText(aVar2.a(fVar2.f172055a.get(i14)));
                tableRow2.addView(textView2);
            }
            if (i15 == 0) {
                tableRow2.setBackgroundColor(Color.rgb(0, 0, 0));
            } else {
                tableRow2.setBackgroundColor(Color.rgb(30, 30, 30));
            }
            PartialTableView.this.addView(tableRow2);
        }
        PartialTableView.this.requestLayout();
    }
}
