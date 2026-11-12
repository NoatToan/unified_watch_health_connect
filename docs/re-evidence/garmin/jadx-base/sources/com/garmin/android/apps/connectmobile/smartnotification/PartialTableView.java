package com.garmin.android.apps.connectmobile.smartnotification;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TableLayout;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class PartialTableView extends TableLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f44296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f44297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b<?> f44298c;

    public class a extends DataSetObserver {
        public a() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            b<?> bVar = PartialTableView.this.f44298c;
            if (bVar == null) {
                return;
            }
            PartialTableView.this.f44296a.post(new d(bVar));
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            b<?> bVar = PartialTableView.this.f44298c;
            if (bVar == null) {
                return;
            }
            PartialTableView.this.f44296a.post(new d(bVar));
        }
    }

    public class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final un1.c<T> f44300a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<un1.a<T>> f44301b;

        public b(un1.c<T> cVar, List<un1.a<T>> list) {
            this.f44300a = cVar;
            this.f44301b = list;
        }
    }

    public PartialTableView(Context context) {
        super(context);
        this.f44296a = new Handler();
        this.f44297b = new a();
    }

    public PartialTableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44296a = new Handler();
        this.f44297b = new a();
    }
}
