package linc.com.amplituda;

/* JADX INFO: loaded from: classes3.dex */
public final class InputAudio<T> {
    private long duration;
    private final T source;
    private Type type;

    public enum Type {
        FILE,
        PATH,
        URL,
        RESOURCE,
        INPUT_STREAM,
        BYTE_ARRAY
    }

    public InputAudio(T t7, long j8, Type type) {
        this.source = t7;
        this.type = type;
        this.duration = j8;
    }

    public long getDuration() {
        return this.duration;
    }

    public T getSource() {
        return this.source;
    }

    public Type getType() {
        return this.type;
    }

    public void setDuration(long j8) {
        this.duration = j8;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public InputAudio(T t7, long j8) {
        this.source = t7;
        this.duration = j8;
    }

    public InputAudio(T t7, Type type) {
        this.source = t7;
        this.type = type;
    }

    public InputAudio(T t7) {
        this.source = t7;
    }
}
