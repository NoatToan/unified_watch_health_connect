package io.github.anotherjack.avoidonresult;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes22.dex */
public class AvoidOnResultFragment extends Fragment {
    private Map<Integer, PublishSubject<ActivityResultInfo>> a = new HashMap();
    private Map<Integer, AvoidOnResult.Callback> b = new HashMap();

    public class a implements Consumer<Disposable> {
        public final /* synthetic */ PublishSubject a;
        public final /* synthetic */ Intent b;

        public a(PublishSubject publishSubject, Intent intent) {
            this.a = publishSubject;
            this.b = intent;
        }

        @Override // io.reactivex.functions.Consumer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Disposable disposable) throws Exception {
            int iC = AvoidOnResultFragment.this.c();
            AvoidOnResultFragment.this.a.put(Integer.valueOf(iC), this.a);
            AvoidOnResultFragment.this.startActivityForResult(this.b, iC);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        Random random = new Random();
        while (true) {
            int iNextInt = random.nextInt(65536);
            if (!this.a.containsKey(Integer.valueOf(iNextInt)) && !this.b.containsKey(Integer.valueOf(iNextInt))) {
                return iNextInt;
            }
        }
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        PublishSubject<ActivityResultInfo> publishSubjectRemove = this.a.remove(Integer.valueOf(i));
        if (publishSubjectRemove != null) {
            publishSubjectRemove.onNext(new ActivityResultInfo(i2, intent));
            publishSubjectRemove.onComplete();
        }
        AvoidOnResult.Callback callbackRemove = this.b.remove(Integer.valueOf(i));
        if (callbackRemove != null) {
            callbackRemove.onActivityResult(i2, intent);
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    public Observable<ActivityResultInfo> startForResult(Intent intent) {
        PublishSubject publishSubjectCreate = PublishSubject.create();
        return publishSubjectCreate.doOnSubscribe(new a(publishSubjectCreate, intent));
    }

    public void startForResult(Intent intent, AvoidOnResult.Callback callback) {
        int iC = c();
        this.b.put(Integer.valueOf(iC), callback);
        startActivityForResult(intent, iC);
    }
}
