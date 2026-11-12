package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.bus.LiveDataBus;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ArrayUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class azm extends RecyclerView.Adapter<gzm> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Observer f3613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kn1 f3614b;
    public List<yym> c = new ArrayList();
    public e d;
    public gzm e;
    public String f;
    public MutableLiveData g;

    public class a implements e {
        public a() {
        }

        @Override // azm.e
        public void a(yym yymVar) {
            if (azm.this.d != null) {
                azm.this.d.a(yymVar);
            }
        }

        @Override // azm.e
        public void b(yym yymVar) {
            if (azm.this.d != null) {
                azm.this.d.b(yymVar);
            }
        }

        @Override // azm.e
        public void c(yym yymVar, boolean z) {
            Logger.i("SleepSnoreDreamTalk", "onSelectedItem:" + z + "item:" + yymVar.d);
            if (azm.this.d != null) {
                azm.this.d.c(yymVar, z);
            }
        }
    }

    public class b implements d {
        public b() {
        }

        @Override // azm.d
        public void a(int i) {
            Logger.i("SleepSnoreDreamTalk", "onSeekBarChangedFromUser" + i);
            azm.this.f3614b.m((long) i);
        }

        @Override // azm.d
        public void b() {
            azm.this.f3614b.h();
        }

        @Override // azm.d
        public void c() {
            azm.this.y();
        }
    }

    public class c implements ewc {
        public c() {
        }

        @Override // defpackage.ewc
        public void onError(String str, String str2) {
            Logger.d("SleepSnoreDreamTalk", "onError:" + str2);
            if (!azm.this.z(str) || azm.this.e == null) {
                return;
            }
            azm.this.e.r(false);
            azm.this.e.updateProgress(0);
        }

        @Override // defpackage.ewc
        public void onFinished(String str) {
            Logger.d("SleepSnoreDreamTalk", "onFinished:" + str);
            if (!azm.this.z(str) || azm.this.e == null) {
                return;
            }
            azm.this.f3614b.l();
            azm.this.e.r(false);
            azm.this.e.updateProgress(0);
        }

        @Override // defpackage.ewc
        public void onInit(String str) {
            Logger.d("SleepSnoreDreamTalk", "onInit fileName:" + str);
            if (!azm.this.z(str) || azm.this.e == null) {
                return;
            }
            azm.this.e.r(true);
            azm.this.e.updateProgress(0);
        }

        @Override // defpackage.ewc
        public void onPaused(String str) {
            Logger.d("SleepSnoreDreamTalk", "onPaused");
            if (!azm.this.z(str) || azm.this.e == null) {
                return;
            }
            azm.this.e.r(false);
        }

        @Override // defpackage.ewc
        public void onPlayed(String str) {
            Logger.d("SleepSnoreDreamTalk", "onPlayed");
            if (!azm.this.z(str) || azm.this.e == null) {
                return;
            }
            azm.this.e.r(true);
        }

        @Override // defpackage.ewc
        public void onProgress(String str, long j, long j2) {
            Logger.d("SleepSnoreDreamTalk", "onProgress:/progress:" + j + "max:" + j2);
            if (!azm.this.z(str) || azm.this.e == null) {
                return;
            }
            azm.this.e.s((int) j, j2);
        }

        @Override // defpackage.ewc
        public void onReset(String str) {
            Logger.d("SleepSnoreDreamTalk", "onReset");
            if (!azm.this.z(str) || azm.this.e == null) {
                return;
            }
            azm.this.e.r(false);
            azm.this.e.updateProgress(0);
        }

        @Override // defpackage.ewc
        public void onStopped(String str) {
            Logger.d("SleepSnoreDreamTalk", "onStopped");
            if (!azm.this.z(str) || azm.this.e == null) {
                return;
            }
            azm.this.e.r(false);
            azm.this.e.updateProgress(0);
        }
    }

    public interface d {
        void a(int i);

        void b();

        void c();
    }

    public interface e {
        void a(yym yymVar);

        void b(yym yymVar);

        void c(yym yymVar, boolean z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (ArrayUtils.isEmpty(this.c)) {
            return 0;
        }
        return this.c.size();
    }

    public void o() {
        Observer observer;
        Logger.i("SleepSnoreDreamTalk", "clearAudioAndRemoveListener");
        kn1 kn1Var = this.f3614b;
        if (kn1Var != null) {
            kn1Var.h();
            this.f3614b.l();
        }
        this.f3614b = null;
        MutableLiveData mutableLiveData = this.g;
        if (mutableLiveData == null || (observer = this.f3613a) == null) {
            return;
        }
        mutableLiveData.removeObserver(observer);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        Logger.i("SleepSnoreDreamTalk", "onAttachedToRecyclerView");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        Logger.i("SleepSnoreDreamTalk", "onDetachedFromRecyclerView");
        o();
    }

    public final void p() {
        this.e = null;
        this.f = null;
        kn1 kn1Var = this.f3614b;
        if (kn1Var != null) {
            kn1Var.l();
        }
    }

    public void q() {
        Logger.i("SleepSnoreDreamTalk", "initAudioAndRegisterListener");
        this.f3614b = new kn1();
        this.g = LiveDataBus.INSTANCE.get().with("stop_media");
        Observer observer = new Observer() { // from class: zym
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f41804a.r(obj);
            }
        };
        this.f3613a = observer;
        this.g.observeForever(observer);
    }

    public final /* synthetic */ void r(Object obj) {
        Logger.i("SleepSnoreDreamTalk", "stop_media callback:" + obj);
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            this.f3614b.h();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(gzm gzmVar, int i) {
        yym yymVar = this.c.get(i);
        gzmVar.f(yymVar);
        gzmVar.o(new a());
        if (!yymVar.e) {
            gzmVar.p(null);
            return;
        }
        this.e = gzmVar;
        File file = yymVar.d;
        if (file != null) {
            String absolutePath = file.getAbsolutePath();
            Logger.i("SleepSnoreDreamTalk", "absoluteFilePath:" + absolutePath);
            this.f = absolutePath;
        }
        this.e.p(new b());
        y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public gzm onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new gzm(LayoutInflater.from(viewGroup.getContext()).inflate(jui.r6, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@NotNull gzm gzmVar) {
        super.onViewAttachedToWindow(gzmVar);
        Logger.i("SleepSnoreDreamTalk", "onViewAttachedToWindow");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(gzm gzmVar) {
        kn1 kn1Var;
        super.onViewDetachedFromWindow(gzmVar);
        if (gzmVar == this.e && (kn1Var = this.f3614b) != null) {
            kn1Var.h();
        }
        Logger.i("SleepSnoreDreamTalk", "onViewDetachedFromWindow：");
    }

    public void w(e eVar) {
        Objects.requireNonNull(eVar);
        this.d = eVar;
    }

    public void x(List<yym> list) {
        this.c = list;
        p();
        notifyDataSetChanged();
    }

    public final void y() {
        if (this.e == null || TextUtils.isEmpty(this.f)) {
            return;
        }
        this.f3614b.j(this.f, new c());
    }

    public final boolean z(String str) {
        String str2 = this.f;
        return str2 != null && TextUtils.equals(str2, str);
    }
}
