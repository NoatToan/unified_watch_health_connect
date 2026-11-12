package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import org.ahocorasick.trie.handler.EmitHandler;

/* JADX INFO: loaded from: classes20.dex */
public class zup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zut f54582a;
    private zuk d;

    private zup(zut zutVar) {
        this.f54582a = zutVar;
        this.d = new zuk();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        zuk zukVarA = this.d;
        for (char c2 : str.toCharArray()) {
            Character chValueOf = Character.valueOf(c2);
            if (this.f54582a.a()) {
                chValueOf.getClass();
                chValueOf = Character.valueOf(Character.toLowerCase(c2));
            }
            zukVarA = zukVarA.a(chValueOf);
        }
        if (this.f54582a.a()) {
            str = str.toLowerCase();
        }
        zukVarA.a(str);
    }

    public Collection<zul> a(CharSequence charSequence) {
        zur zurVar = new zur();
        c(charSequence, zurVar);
        List<zul> listC = zurVar.c();
        if (this.f54582a.b()) {
            d(charSequence, listC);
        }
        if (this.f54582a.e()) {
            c(charSequence, listC);
        }
        if (!this.f54582a.d()) {
            new zuo(listC).a(listC);
        }
        return listC;
    }

    public void c(CharSequence charSequence, EmitHandler emitHandler) {
        zuk zukVarC = this.d;
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            Character chValueOf = Character.valueOf(cCharAt);
            if (this.f54582a.a()) {
                chValueOf.getClass();
                chValueOf = Character.valueOf(Character.toLowerCase(cCharAt));
            }
            zukVarC = c(zukVarC, chValueOf);
            if (b(i, zukVarC, emitHandler) && this.f54582a.c()) {
                return;
            }
        }
    }

    private boolean c(CharSequence charSequence, zul zulVar) {
        return (zulVar.getStart() != 0 && Character.isAlphabetic(charSequence.charAt(zulVar.getStart() - 1))) || (zulVar.getEnd() + 1 != charSequence.length() && Character.isAlphabetic(charSequence.charAt(zulVar.getEnd() + 1)));
    }

    private void d(CharSequence charSequence, List<zul> list) {
        ArrayList arrayList = new ArrayList();
        for (zul zulVar : list) {
            if (c(charSequence, zulVar)) {
                arrayList.add(zulVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.remove((zul) it.next());
        }
    }

    private void c(CharSequence charSequence, List<zul> list) {
        long length = charSequence.length();
        ArrayList arrayList = new ArrayList();
        for (zul zulVar : list) {
            if ((zulVar.getStart() != 0 && !Character.isWhitespace(charSequence.charAt(zulVar.getStart() - 1))) || (zulVar.getEnd() + 1 != length && !Character.isWhitespace(charSequence.charAt(zulVar.getEnd() + 1)))) {
                arrayList.add(zulVar);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            list.remove((zul) it.next());
        }
    }

    private zuk c(zuk zukVar, Character ch) {
        zuk zukVarB = zukVar.b(ch);
        while (zukVarB == null) {
            zukVar = zukVar.d();
            zukVarB = zukVar.b(ch);
        }
        return zukVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque();
        for (zuk zukVar : this.d.c()) {
            zukVar.d(this.d);
            linkedBlockingDeque.add(zukVar);
        }
        while (!linkedBlockingDeque.isEmpty()) {
            zuk zukVar2 = (zuk) linkedBlockingDeque.remove();
            for (Character ch : zukVar2.a()) {
                zuk zukVarB = zukVar2.b(ch);
                linkedBlockingDeque.add(zukVarB);
                zuk zukVarD = zukVar2.d();
                while (zukVarD.b(ch) == null) {
                    zukVarD = zukVarD.d();
                }
                zuk zukVarB2 = zukVarD.b(ch);
                zukVarB.d(zukVarB2);
                zukVarB.a(zukVarB2.e());
            }
        }
    }

    private boolean b(int i, zuk zukVar, EmitHandler emitHandler) {
        Collection<String> collectionE = zukVar.e();
        boolean z = false;
        if (collectionE != null && !collectionE.isEmpty()) {
            for (String str : collectionE) {
                emitHandler.emit(new zul((i - str.length()) + 1, i, str));
                z = true;
            }
        }
        return z;
    }

    public static b a() {
        return new b();
    }

    /* JADX INFO: loaded from: classes46.dex */
    public static class b {
        private zut d;
        private zup e;

        private b() {
            this.d = new zut();
            this.e = new zup(this.d);
        }

        public b e(String str) {
            this.e.b(str);
            return this;
        }

        public zup a() {
            this.e.e();
            return this.e;
        }
    }
}
