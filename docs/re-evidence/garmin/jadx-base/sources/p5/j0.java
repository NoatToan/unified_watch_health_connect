package p5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001e\b\u0002\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bBC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"Lp5/j0;", "T", "", "", "name", "Lkotlin/Function2;", "mergePolicy", "<init>", "(Ljava/lang/String;Le23/p;)V", "", "isImportantForAccessibility", "(Ljava/lang/String;Z)V", "accessibilityExtraKey", "(Ljava/lang/String;ZLe23/p;Ljava/lang/String;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.p<T, T, T> f136023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f136024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f136025d;

    @Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0006\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\b\u0010\u0002\u001a\u0004\u0018\u0001H\u00012\u0006\u0010\u0003\u001a\u0002H\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "T", "parentValue", "childValue", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a extends p005kotlin.jvm.internal.w implements e23.p<T, T, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f136026a = new a();

        public a() {
            super(2);
        }

        @Override // e23.p
        public final T invoke(T t7, T t14) {
            return t7 == null ? t14 : t7;
        }
    }

    public /* synthetic */ j0(String str, e23.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, (i14 & 2) != 0 ? a.f136026a : pVar);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.f136022a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0(String str, e23.p<? super T, ? super T, ? extends T> pVar) {
        this.f136022a = str;
        this.f136023b = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public j0(String str, boolean z14) {
        this(str, (e23.p) null, 2, (p005kotlin.jvm.internal.j) (0 == true ? 1 : 0));
        this.f136024c = z14;
    }

    public /* synthetic */ j0(String str, boolean z14, e23.p pVar, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this(str, z14, pVar, (i14 & 8) != 0 ? null : str2);
    }

    public j0(String str, boolean z14, e23.p<? super T, ? super T, ? extends T> pVar, String str2) {
        this(str, pVar);
        this.f136024c = z14;
        this.f136025d = str2;
    }
}
