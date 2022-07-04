package plugin.apkInstaller;

import androidx.core.content.FileProvider;

public class ApkInstallerProvider extends FileProvider {
   // avoid android:authrities conflict with other lib which also use android.support.v4.content.FileProvider
}
