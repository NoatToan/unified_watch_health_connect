package ch.qos.logback.core.rolling;

import ch.qos.logback.core.joran.spi.NoAutoStart;
import ch.qos.logback.core.rolling.helper.DefaultFileProvider;
import ch.qos.logback.core.rolling.helper.TimeBasedArchiveRemover;
import java.io.File;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
@NoAutoStart
public class DefaultTimeBasedFileNamingAndTriggeringPolicy<E> extends TimeBasedFileNamingAndTriggeringPolicyBase<E> {
    @Override // ch.qos.logback.core.rolling.TriggeringPolicy
    public boolean isTriggeringEvent(File file, E e4) {
        long currentTime = getCurrentTime();
        if (currentTime < this.nextCheck) {
            return false;
        }
        Date date = this.dateInCurrentPeriod;
        addInfo("Elapsed period: " + date);
        this.elapsedPeriodsFileName = this.tbrp.fileNamePatternWithoutCompSuffix.convert(date);
        setDateInCurrentPeriod(currentTime);
        computeNextCheck();
        return true;
    }

    @Override // ch.qos.logback.core.rolling.TimeBasedFileNamingAndTriggeringPolicyBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        if (super.isErrorFree()) {
            boolean zHasIntegerTokenCOnverter = this.tbrp.fileNamePattern.hasIntegerTokenCOnverter();
            TimeBasedRollingPolicy<E> timeBasedRollingPolicy = this.tbrp;
            if (zHasIntegerTokenCOnverter) {
                addError("Filename pattern [" + timeBasedRollingPolicy.fileNamePattern + "] contains an integer token converter, i.e. %i, INCOMPATIBLE with this configuration. Remove it.");
                return;
            }
            TimeBasedArchiveRemover timeBasedArchiveRemover = new TimeBasedArchiveRemover(timeBasedRollingPolicy.fileNamePattern, this.f27285rc, new DefaultFileProvider());
            this.archiveRemover = timeBasedArchiveRemover;
            timeBasedArchiveRemover.setContext(this.context);
            this.started = true;
        }
    }

    public String toString() {
        return "c.q.l.core.rolling.DefaultTimeBasedFileNamingAndTriggeringPolicy";
    }
}
