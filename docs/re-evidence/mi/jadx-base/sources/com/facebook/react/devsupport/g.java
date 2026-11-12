package com.facebook.react.devsupport;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import defpackage.cm8;
import defpackage.e4f;
import defpackage.fqi;
import defpackage.i3j;
import defpackage.m8o;
import defpackage.n06;
import defpackage.p8o;
import defpackage.rvi;
import defpackage.sk1;
import defpackage.x27;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class g extends Dialog implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n06 f7338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x27 f7339b;
    public final RedBoxHandler c;
    public ListView d;
    public Button e;
    public Button f;
    public Button g;
    public TextView h;
    public ProgressBar i;
    public View j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7340k;
    public RedBoxHandler.a l;
    public View.OnClickListener m;

    public class a implements RedBoxHandler.a {
        public a() {
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (g.this.c == null || !g.this.c.a() || g.this.f7340k) {
                return;
            }
            g.this.f7340k = true;
            ((TextView) sk1.c(g.this.h)).setText("Reporting...");
            ((TextView) sk1.c(g.this.h)).setVisibility(0);
            ((ProgressBar) sk1.c(g.this.i)).setVisibility(0);
            ((View) sk1.c(g.this.j)).setVisibility(0);
            ((Button) sk1.c(g.this.g)).setEnabled(false);
            g.this.c.b(view.getContext(), (String) sk1.c(g.this.f7338a.getLastErrorTitle()), (m8o[]) sk1.c(g.this.f7338a.getLastErrorStack()), g.this.f7338a.getSourceUrl(), (RedBoxHandler.a) sk1.c(g.this.l));
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.f7338a.handleReloadJS();
        }
    }

    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            g.this.dismiss();
        }
    }

    public static class e extends AsyncTask<m8o, Void, Void> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final MediaType f7345b = MediaType.parse("application/json; charset=utf-8");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n06 f7346a;

        public /* synthetic */ e(n06 n06Var, a aVar) {
            this(n06Var);
        }

        public static JSONObject b(m8o m8oVar) {
            return new JSONObject(e4f.g("file", m8oVar.m(), "methodName", m8oVar.a(), "lineNumber", Integer.valueOf(m8oVar.k()), "column", Integer.valueOf(m8oVar.l())));
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(m8o... m8oVarArr) {
            try {
                String string = Uri.parse(this.f7346a.getSourceUrl()).buildUpon().path("/open-stack-frame").query(null).build().toString();
                OkHttpClient okHttpClient = new OkHttpClient();
                for (m8o m8oVar : m8oVarArr) {
                    okHttpClient.newCall(new Request.Builder().url(string).post(RequestBody.create(f7345b, b(m8oVar).toString())).build()).execute();
                }
            } catch (Exception e) {
                cm8.j("ReactNative", "Could not open stack frame", e);
            }
            return null;
        }

        public e(n06 n06Var) {
            this.f7346a = n06Var;
        }
    }

    public static class f extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7347a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m8o[] f7348b;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final TextView f7349a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final TextView f7350b;

            public /* synthetic */ a(View view, a aVar) {
                this(view);
            }

            public a(View view) {
                this.f7349a = (TextView) view.findViewById(fqi.j);
                this.f7350b = (TextView) view.findViewById(fqi.i);
            }
        }

        public f(String str, m8o[] m8oVarArr) {
            this.f7347a = str;
            this.f7348b = m8oVarArr;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            return false;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f7348b.length + 1;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return i == 0 ? this.f7347a : this.f7348b[i - 1];
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            return i == 0 ? 0 : 1;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (i == 0) {
                TextView textView = view != null ? (TextView) view : (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(rvi.d, viewGroup, false);
                textView.setText(this.f7347a.replaceAll("\\x1b\\[[0-9;]*m", ""));
                return textView;
            }
            if (view == null) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(rvi.c, viewGroup, false);
                view.setTag(new a(view, null));
            }
            m8o m8oVar = this.f7348b[i - 1];
            a aVar = (a) view.getTag();
            aVar.f7349a.setText(m8oVar.a());
            aVar.f7350b.setText(p8o.c(m8oVar));
            return view;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 2;
        }

        @Override // android.widget.BaseAdapter, android.widget.ListAdapter
        public boolean isEnabled(int i) {
            return i > 0;
        }
    }

    public g(Context context, n06 n06Var, RedBoxHandler redBoxHandler) {
        super(context, i3j.f20742a);
        this.f7340k = false;
        this.l = new a();
        this.m = new b();
        requestWindowFeature(1);
        setContentView(rvi.e);
        this.f7338a = n06Var;
        this.f7339b = new x27();
        this.c = redBoxHandler;
        ListView listView = (ListView) findViewById(fqi.q);
        this.d = listView;
        listView.setOnItemClickListener(this);
        Button button = (Button) findViewById(fqi.n);
        this.e = button;
        button.setOnClickListener(new c());
        Button button2 = (Button) findViewById(fqi.f18089k);
        this.f = button2;
        button2.setOnClickListener(new d());
        if (redBoxHandler == null || !redBoxHandler.a()) {
            return;
        }
        this.i = (ProgressBar) findViewById(fqi.m);
        this.j = findViewById(fqi.l);
        TextView textView = (TextView) findViewById(fqi.p);
        this.h = textView;
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        this.h.setHighlightColor(0);
        Button button3 = (Button) findViewById(fqi.o);
        this.g = button3;
        button3.setOnClickListener(this.m);
    }

    public void j() {
        RedBoxHandler redBoxHandler = this.c;
        if (redBoxHandler == null || !redBoxHandler.a()) {
            return;
        }
        this.f7340k = false;
        ((TextView) sk1.c(this.h)).setVisibility(8);
        ((ProgressBar) sk1.c(this.i)).setVisibility(8);
        ((View) sk1.c(this.j)).setVisibility(8);
        ((Button) sk1.c(this.g)).setVisibility(0);
        ((Button) sk1.c(this.g)).setEnabled(true);
    }

    public void k(String str, m8o[] m8oVarArr) {
        this.d.setAdapter((ListAdapter) new f(str, m8oVarArr));
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        new e(this.f7338a, null).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (m8o) this.d.getAdapter().getItem(i));
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 82) {
            this.f7338a.showDevOptionsDialog();
            return true;
        }
        if (this.f7339b.b(i, getCurrentFocus())) {
            this.f7338a.handleReloadJS();
        }
        return super.onKeyUp(i, keyEvent);
    }
}
